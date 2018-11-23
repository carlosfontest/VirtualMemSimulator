package model;

import controller.Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author Carlos Fontes & Rafael Quintero
 */
public class Proceso {

    private final double clockTime = 500;
    private int ID;
    private String nombre;
    private String estado;
    private int cantPaginas;
    private int cantPagMP;
    private int cantPagMS;
    private Double tiempoMaxEjecucion;
    private Double tiempoEjecucion;
    private int tamaño;
    private Pagina[] paginas;

    public Proceso(int ID, String nombre, Double tiempoMaxEjecucion, int tamaño) {
        this.ID = ID;
        this.nombre = nombre;
        this.tiempoMaxEjecucion = tiempoMaxEjecucion;
        this.tiempoEjecucion = 0.0;
        this.tamaño = tamaño;
        this.estado = "Ejecución";
        this.cantPaginas = (int) Math.ceil((float) this.tamaño / Controller.tamañoPagina);
        this.paginas = new Pagina[cantPaginas];
        this.cantPagMP = 0;
        this.cantPagMS = 0;

        // Creamos las páginas del proceso
        this.crearPaginas();
        //this.verPaginas();

        // Creamos el timer para saber los ciclos de ejecución
        System.out.println("\nSoy " + this.nombre + " y tengo " + this.tiempoMaxEjecucion + " para ejecutarme. Deberia aparecer " + this.tiempoMaxEjecucion / 0.5);
    }

    public void startTimer() {
        Proceso proceso = this;

        Timer timer = new Timer((int) (clockTime * 1000), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                // Si me toca ejecutarme
                if (!Controller.colaProcesos.isEmpty() && Controller.colaProcesos.peek().ID == proceso.ID) {
                    // Se ejecuta
                    if (proceso.getEstado().equals("Suspendido/Listo")) {
                        // Hay que reemplazar del primero de MP
                        proceso.reemplazar();
                    } else {
                        System.out.println("Error, el proceso " + proceso.getID() + " entra sin estar listo/suspendido timer-proceso");
                    }
                    proceso.setEstado("Ejecución");
                    Controller.actualizarMemorias();
                }

                if (proceso.getEstado().equals("Ejecución")) {

                }

            }
        });
        timer.start();
    }

    private void crearPaginas() {
        // Número de páginas completas sin fragmentación interna
        int paginasCompletas = this.tamaño / Controller.tamañoPagina;
        // Número y tamaño de páginas incompletas con fragmentación interna
        int paginasIncompletas = 0;
        int tamañoPagIncompleta = 0;
        if (paginasCompletas != this.cantPaginas) { // Si hay paginas incompletas
            paginasIncompletas = 1;
            tamañoPagIncompleta = this.tamaño % Controller.tamañoPagina;
        }
        // Creamos las páginas completas
        for (int i = 0; i < paginasCompletas; i++) {
            this.paginas[i] = new Pagina(i + 1, Controller.tamañoPagina, this.ID);
        }
        // Creamos la página incompleta en la última posición en caso de haber páginsa incompletas
        if (paginasIncompletas == 1) {
            this.paginas[this.cantPaginas - 1] = new Pagina(this.cantPaginas, tamañoPagIncompleta, this.ID);
        }
    }

    public void reemplazar() {
        int marcosDispon = Controller.memoriaPrincipal.length - Controller.cantMarcosOcupados;
        int cantPagsNecesitoEnMP = this.getMitad();
        int cantPagsNecesitoEnMS = this.getPaginas().length - cantPagsNecesitoEnMP;
        int pagsMetereEnMP = this.getMitad() - this.getCantPagMP();
        if (pagsMetereEnMP <= 0) {
            System.out.println("Errorcito leve xD");
        }
        // Si hay espacio para meter las páginas sin tener que reemplazar
        if (marcosDispon >= pagsMetereEnMP) {
            for (int i = 0; i < Controller.memoriaPrincipal.length; i++) {
                if (Controller.memoriaPrincipal[i].getPagina() == null) {
                    for (int j = 0; j < this.paginas.length; j++) {
                        if (!this.paginas[j].isInMemoriaPrincipal()) {
                            Controller.memoriaPrincipal[i].setPagina(this.paginas[j]);
                            this.paginas[j].setInMemoriaPrincipal(true);
                            pagsMetereEnMP--;
                            // Modificamos variables
                            Controller.cantEspaciosOcupadosMS--;
                            Controller.cantMarcosOcupados++;
                            break;
                        }
                    }
                }
                if (pagsMetereEnMP <= 0) {
                    break;
                }
            }
        } else {
            // Si hay que reemplazar
            // Verificar si hay algun marco disponible, pero sin ser todos los que se necesitan
            if (marcosDispon > 0) {
                for (int i = 0; i < Controller.memoriaPrincipal.length; i++) {
                    if (Controller.memoriaPrincipal[i].getPagina() == null) {
                        for (int j = 0; j < this.paginas.length; j++) {
                            if (!this.paginas[j].isInMemoriaPrincipal()) {
                                Controller.memoriaPrincipal[i].setPagina(this.paginas[j]);
                                this.paginas[j].setInMemoriaPrincipal(true);
                                pagsMetereEnMP--;
                                marcosDispon--;
                                // Modificamos variables
                                Controller.cantEspaciosOcupadosMS--;
                                Controller.cantMarcosOcupados++;
                                break;
                            }
                        }
                    }
                    if (marcosDispon <= 0) {
                        break;
                    }
                }
            }
            // Se meten las páginas que faltan por meter en MP (o en su defecto, todas las que tengan que estar)
            // Verifico que procesos voy a quitar
            boolean ready = false;
            // Recorro todos los procesos que están en la cola de MP
            for (Proceso pro : Controller.colaMemoriaPrincipal) {
                // Verifico si ya se pusieron todas las páginas en MP
                if (ready) {
                    break;
                }
                // Recorro todas las páginas del proceso
                for (int i = 0; i < pro.getPaginas().length; i++) {
                    // Si la página está en MP la saco y meto la del proceso nuevo
                    if (pro.getPaginas()[i].isInMemoriaPrincipal()) {
                        if (pagsMetereEnMP <= 0) {
                            ready = true;
                            break;
                        }
                        pagsMetereEnMP--;
                        // Meto la página en MS y la saco de MP
                        for (int j = 0; j < Controller.memoriaSecundaria.length; j++) {
                            if (Controller.memoriaSecundaria[j].getPagina() == null) {
                                Controller.memoriaSecundaria[j].setPagina(pro.getPaginas()[i]);
                                pro.getPaginas()[i].setInMemoriaPrincipal(false);
                                Controller.actualizarMemorias();
                                break;
                            }
                        }
                        for (int j = 0; j < Controller.memoriaPrincipal.length; j++) {
                            // Si son del mismo proceso y el mismo numero de pagina
                            // System.out.println("Estoy en el " + pro.getNombre() + " y voy a sacar a la pag " + pro.getPaginas()[i].getNumPagina());
                            if (Controller.memoriaPrincipal[j].getPagina().getNumPagina() == pro.getPaginas()[i].getNumPagina() && Controller.memoriaPrincipal[j].getPagina().getIDProceso() == pro.getPaginas()[i].getIDProceso()) {
                                for (int k = 0; k < this.getPaginas().length; k++) {
                                    if (!this.getPaginas()[k].isInMemoriaPrincipal()) {
                                        Controller.memoriaPrincipal[j].setPagina(this.paginas[k]);
                                        this.paginas[k].setInMemoriaPrincipal(true);
                                        pagsMetereEnMP--;
                                        Controller.actualizarMemorias();
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                Controller.actualizarMemorias();
            }
        }
    }

    public void verPaginas() {
        System.out.println("\nSoy el proceso " + this.nombre);
        System.out.println("-------------------------------");
        for (int i = 0; i < this.paginas.length; i++) {
            System.out.println("Soy la página N° " + this.paginas[i].getNumPagina() + " peso " + this.paginas[i].getTamaño() + " y tengo fragmentación de " + this.paginas[i].getTamañoFragmentacion());
        }
        System.out.println("-------------------------------");
    }

    public int getCantPaginas() {
        return cantPaginas;
    }

    public String getEstado() {
        return estado;
    }

    public int getID() {
        return ID;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getTiempoEjecucion() {
        return tiempoEjecucion;
    }

    public int getTamaño() {
        return tamaño;
    }

    public Pagina[] getPaginas() {
        return paginas;
    }

    public Double getTiempoMaxEjecucion() {
        return tiempoMaxEjecucion;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCantPaginas(int cantPaginas) {
        this.cantPaginas = cantPaginas;
    }

    public void setTiempoMaxEjecucion(Double tiempoMaxEjecucion) {
        this.tiempoMaxEjecucion = tiempoMaxEjecucion;
    }

    public void setTiempoEjecucion(Double tiempoEjecucion) {
        this.tiempoEjecucion = tiempoEjecucion;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public void setPaginas(Pagina[] paginas) {
        this.paginas = paginas;
    }

    public void setCantPagMP(int cantPagMP) {
        this.cantPagMP = cantPagMP;
    }

    public void setCantPagMS(int cantPagMS) {
        this.cantPagMS = cantPagMS;
    }

    public int getCantPagMP() {
        return cantPagMP;
    }

    public int getCantPagMS() {
        return cantPagMS;
    }

    public void addMP() {
        this.cantPagMP++;
        this.cantPagMS--;

        // Bloqueado
        if (!Controller.colaProcesos.contains(this)) {
            if (this.cantPagMP >= this.getMitad()) {
                this.setEstado("Bloqueado");
            } else {
                this.setEstado("Suspendido/Bloqueado");
            }
            // Listo
        } else {
            if (this.cantPagMP >= this.getMitad()) {
                this.setEstado("Listo");
            } else {
                this.setEstado("Suspendido/Listo");
            }
        }

        // Si todas sus paginas estan en MS y sumas en MP, pasa a la cola de MP
        if (!Controller.colaMemoriaPrincipal.contains(this)) {
            Controller.colaMemoriaPrincipal.offer(this);
        }

    }

    public int getMitad() {
        return ((int) Math.ceil((double) this.getPaginas().length / 2));
    }

    public void substractMP() {
        this.cantPagMP--;
        this.cantPagMS++;

        // Si las paginas en MP < mitad => suspendido
        if (this.cantPagMP < this.getMitad()) {
            if (Controller.colaProcesos.contains(this)) {
                this.setEstado("Suspendido/Listo");
                Controller.actualizarMemorias();
            } else {
                this.setEstado("Suspendido/Bloqueado");
                Controller.actualizarMemorias();
            }
            // Si se quitó la ultima página de MP
        } else if (this.cantPagMP == 0) {
            Controller.colaMemoriaPrincipal.remove(this);
            if (Controller.colaProcesos.contains(this)) {
                this.setEstado("Suspendido/Listo");
                Controller.actualizarMemorias();
            } else {
                this.setEstado("Suspendido/Bloqueado");
                Controller.actualizarMemorias();
            }
        }
    }

    public void modificarPagina(boolean flag) {
        if (flag) {
            this.addMP();
        } else {
            this.substractMP();
        }
        Controller.actualizarMemorias();
    }

}
