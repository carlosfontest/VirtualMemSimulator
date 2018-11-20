package model;

import controller.Controller;

/**
 *
 * @author Carlos Fontes & Rafael Quintero
 */
public class Pagina {
    private int numPagina;
    private int tamaño;
    private boolean fragmentacion;
    private int tamañoFragmentacion;
    private boolean inMemoriaPrincipal;

    public Pagina(int numPagina, int tamaño) {
        this.numPagina = numPagina;
        this.tamaño = tamaño;
        // Si hay fragmentacion
        if(tamaño < Controller.tamañoPagina) {
            this.fragmentacion = true;
            this.tamañoFragmentacion = Controller.tamañoPagina - this.tamaño;
        } else {
            this.fragmentacion = false;
            this.tamañoFragmentacion = 0;
        }
    }

    public int getNumPagina() {
        return numPagina;
    }

    public int getTamaño() {
        return tamaño;
    }

    public boolean isFragmentacion() {
        return fragmentacion;
    }

    public int getTamañoFragmentacion() {
        return tamañoFragmentacion;
    }
    
    
    
    

    
    
}
