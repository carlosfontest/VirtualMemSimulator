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

    private final double clockTime = 30;
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
                // Si se está ejecutando hay que sacarlo de memoria principal
                if (!Controller.colaProcesos.isEmpty() && Controller.colaProcesos.peek().ID == proceso.ID && proceso.getEstado().equals("Ejecución")) {
                    // Subimos 0.5seg al tiempo de ejecución
                    proceso.setTiempoEjecucion(proceso.getTiempoEjecucion() + clockTime);
                    // Verificamos si se acabo el tiempo
                    if (proceso.getTiempoEjecucion() >= proceso.getTiempoMaxEjecucion()) {
                        // Eliminar Proceso
                        Controller.colaProcesos.poll();
                        proceso.setEstado("Eliminado");
                        Controller.eliminarProceso(proceso);
                        proceso.setCantPagMP(0);
                        proceso.setCantPagMS(0);
                        System.out.println("Se terminó el tiempo de ejecución de " + proceso.getNombre());
                        return;
                    } else {
                        Controller.colaProcesos.offer(Controller.colaProcesos.poll());
                    }
                    // Si hay algún proceso queriendo ejecutarse
                    if (Controller.colaProcesos.peek().ID != proceso.ID) {
                        // Pasarlo a memoria secundaria
                        // Pasar proceso que se quiere ejecutar a memoria principal
                        // TODO
                        //System.out.println("Se pasa proceso " + getNombre() + " a MS");
                    } else {
                        System.out.println("Se ejecuta el " + proceso.getNombre());
                    }
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
