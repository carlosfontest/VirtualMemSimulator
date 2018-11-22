package model;

/**
 *
 * @author Carlos Fontes & Rafael Quintero
 */
public class Marco {
    private String dirFisica;
    private int numMarco;
    private Pagina pagina;
    private boolean inMemoriaPrincipal;

    public Marco(String dirFisica, int numMarco, Pagina pagina, boolean inMemoriaPrincipal) {
        this.dirFisica = dirFisica;
        this.numMarco = numMarco;
        this.pagina = pagina;
        this.inMemoriaPrincipal = inMemoriaPrincipal;
    }
    
    public String getDirFisica() {
        return dirFisica;
    }

    public int getNumMarco() {
        return numMarco;
    }

    public Pagina getPagina() {
        return pagina;
    }

    public boolean isInMemoriaPrincipal() {
        return inMemoriaPrincipal;
    }

    public void setDirFisica(String dirFisica) {
        this.dirFisica = dirFisica;
    }

    public void setNumMarco(int numMarco) {
        this.numMarco = numMarco;
    }

    public void setPagina(Pagina pagina) {
        this.pagina = pagina;
    }

    public void setInMemoriaPrincipal(boolean inMemoriaPrincipal) {
        this.inMemoriaPrincipal = inMemoriaPrincipal;
    }
    
    
    
    
    
    
    

    
    
    
    
}
