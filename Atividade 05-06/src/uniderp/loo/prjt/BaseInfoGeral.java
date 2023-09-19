package uniderp.loo.prjt;

public abstract class BaseInfoGeral extends BaseIdentificador {
    protected String nome;
    protected String modelo;
    protected int anoFabricacao;
    protected double pesoLiquido;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAnoFabricacao() {
        return anoFabricacao;
    }
    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    public double getPesoLiquido() {
        return pesoLiquido;
    }
    public void setPesoLiquido(double pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }
    public BaseInfoGeral(int codigo, String nome, String modelo, int anoFabricacao, double pesoLiquido) {
        super(codigo);
        this.nome = nome;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.pesoLiquido = pesoLiquido;
    }

}
