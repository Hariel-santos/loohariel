package uniderp.loo.estagiario;

public abstract class BaseDados extends BaseIdentificador{
    
    protected String registro;

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public BaseDados(int codigo, String registro) {
        super(codigo);
        this.registro = registro;
    }
 
    
}
