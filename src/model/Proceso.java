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
    private int ID;
    private String nombre;
    private String estado;
    private int cantPaginas;
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
        this.cantPaginas = (int)Math.ceil((float)this.tamaño/Controller.tamañoPagina);
        this.paginas = new Pagina[cantPaginas];
        
        // Creamos las páginas del proceso
        this.crearPaginas();
        //this.verPaginas();
        
        // Creamos el timer para saber los ciclos de ejecución
        System.out.println("\nSoy " + this.nombre + " y tengo " + this.tiempoMaxEjecucion + " para ejecutarme. Deberia aparecer " + this.tiempoMaxEjecucion/0.5);
        
        
        
        Timer timer = new Timer(1000, new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent ae) {
                // Si se está ejecutando hay que sacarlo de memoria principal
                if(getEstado().equals("Ejecución")) {
                    // Subimos 0.5seg al tiempo de ejecución
                    setTiempoEjecucion(getTiempoEjecucion() + 0.5);
                    // Verificamos si se acabo el tiempo
                    if(getTiempoEjecucion() >= getTiempoMaxEjecucion()) {
                        // Eliminar Proceso
                        setEstado("Eliminado");
                        System.out.println("Se terminó el tiempo de ejecución de " + getNombre());
                        return;
                    }
                    // Si hay algún proceso queriendo ejecutarse
                    if(Controller.colaMemoriaSecundaria.peek() != null) {
                        // Pasarlo a memoria secundaria
                        // Pasar proceso que se quiere ejecutar a memoria principal
                        // TODO
                        System.out.println("Se pasa proceso " + getNombre() + " a MS");
                    } else {
                        System.out.println("Se mantiene " + getNombre() + " en MP");
                    }
                }
            }
        }); 
        timer.start();
    }
    
    private void crearPaginas() {
        // Número de páginas completas sin fragmentación interna
        int paginasCompletas = this.tamaño/Controller.tamañoPagina;
        // Número y tamaño de páginas incompletas con fragmentación interna
        int paginasIncompletas = 0;
        int tamañoPagIncompleta = 0;
        if(paginasCompletas != this.cantPaginas) { // Si hay paginas incompletas
            paginasIncompletas = 1;
            tamañoPagIncompleta = this.tamaño % Controller.tamañoPagina; 
        }
        // Creamos las páginas completas
        for (int i = 0; i < paginasCompletas; i++) {
            this.paginas[i] = new Pagina(i + 1, Controller.tamañoPagina);
        }
        // Creamos la página incompleta en la última posición en caso de haber páginsa incompletas
        if(paginasIncompletas == 1) {
            this.paginas[this.cantPaginas - 1] = new Pagina(this.cantPaginas, tamañoPagIncompleta);
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
    
    
    
    
    
    
    
    
    
    
    
    
}
