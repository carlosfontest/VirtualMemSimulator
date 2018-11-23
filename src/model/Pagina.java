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
    private int IDProceso;

    public Pagina(int numPagina, int tamaño, int IDProceso) {
        this.IDProceso = IDProceso;
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

    public boolean isInMemoriaPrincipal() {
        return inMemoriaPrincipal;
    }

    public int getIDProceso() {
        return IDProceso;
    }

    public void setNumPagina(int numPagina) {
        this.numPagina = numPagina;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public void setFragmentacion(boolean fragmentacion) {
        this.fragmentacion = fragmentacion;
    }

    public void setTamañoFragmentacion(int tamañoFragmentacion) {
        this.tamañoFragmentacion = tamañoFragmentacion;
    }

    public void setInMemoriaPrincipal(boolean inMemoriaPrincipal) {
        Controller.modificarProceso(this.IDProceso, inMemoriaPrincipal);
        this.inMemoriaPrincipal = inMemoriaPrincipal;
        Controller.actualizarMemorias();
    }

    public void setIDProceso(int IDProceso) {
        this.IDProceso = IDProceso;
    }
    
    
    
    public void crearSetInMemoriaP(boolean inMemoriaP){
        this.inMemoriaPrincipal = inMemoriaP;
    }
}
