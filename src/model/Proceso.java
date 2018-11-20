package model;
import controller.Controller;

/**
 *
 * @author Carlos Fontes & Rafael Quintero
 */
public class Proceso {
    private int ID;
    private String nombre;
    private String estado;
    private int cantPaginas;
    private int tiempoEjecucion;
    private int tamaño;
    private Pagina[] paginas;

    public Proceso(int ID, String nombre, int tiempoEjecucion, int tamaño) {
        this.ID = ID;
        this.nombre = nombre;
        this.tiempoEjecucion = tiempoEjecucion;
        this.tamaño = tamaño;
        this.estado = "Ejecución";
        this.cantPaginas = (int)Math.ceil((float)this.tamaño/Controller.tamañoPagina);
        this.paginas = new Pagina[cantPaginas];
        
        // Creamos las páginas del proceso
        this.crearPaginas();
        this.verPaginas();
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

    public int getTiempoEjecucion() {
        return tiempoEjecucion;
    }

    public int getTamaño() {
        return tamaño;
    }

    public Pagina[] getPaginas() {
        return paginas;
    }
    
    public void verPaginas() {
        System.out.println("\nSoy el proceso " + this.nombre);
        System.out.println("-------------------------------");
        for (int i = 0; i < this.paginas.length; i++) {
            System.out.println("Soy la página N° " + this.paginas[i].getNumPagina() + " y peso " + this.paginas[i].getTamaño());
        }
        System.out.println("-------------------------------");
    }
    
    
    
    
    
    
    
    
    
    
}
