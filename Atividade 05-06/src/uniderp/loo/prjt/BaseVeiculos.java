package uniderp.loo.prjt;

public abstract class BaseVeiculos extends BaseInfoGeral implements IImpressao{
    protected String cor;
    protected int anoModelo;
    protected int eixos;
    protected double pesoTotal;
    protected int assentos;
    protected int rodas;
    protected String fabricante;
    protected double potencia;
    protected String tipoCombustivel;
    protected String nomeProprietario;
    protected String cidadeUf;
    protected String estadoUf;
    protected String tipoVeiculo;
    protected int qtdeOcupantes;
    protected int qtdeMotores;
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getAnoModelo() {
        return anoModelo;
    }
    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }
    public int getEixos() {
        return eixos;
    }
    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
    public double getPesoTotal() {
        return pesoTotal;
    }
    public void setPesoTotal(double pesoTotal) {
        this.pesoTotal = pesoTotal;
    }
    public int getAssentos() {
        return assentos;
    }
    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }
    public int getRodas() {
        return rodas;
    }
    public void setRodas(int rodas) {
        this.rodas = rodas;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public double getPotencia() {
        return potencia;
    }
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }
    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    public String getNomeProprietario() {
        return nomeProprietario;
    }
    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }
    public String getCidadeUf() {
        return cidadeUf;
    }
    public void setCidadeUf(String cidadeUf) {
        this.cidadeUf = cidadeUf;
    }
    public String getEstadoUf() {
        return estadoUf;
    }
    public void setEstadoUf(String estadoUf) {
        this.estadoUf = estadoUf;
    }
    public String getTipoVeiculo() {
        return tipoVeiculo;
    }
    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }
    public int getQtdeOcupantes() {
        return qtdeOcupantes;
    }
    public void setQtdeOcupantes(int qtdeOcupantes) {
        this.qtdeOcupantes = qtdeOcupantes;
    }
    public int getQtdeMotores() {
        return qtdeMotores;
    }
    public void setQtdeMotores(int qtdeMotores) {
        this.qtdeMotores = qtdeMotores;
    }
    public BaseVeiculos(int codigo, String nome, String modelo, int anoFabricacao, double pesoLiquido, String cor,
            int anoModelo, int eixos, double pesoTotal, int assentos, int rodas, String fabricante, double potencia,
            String tipoCombustivel, String nomeProprietario, String cidadeUf, String estadoUf, String tipoVeiculo,
            int qtdeOcupantes, int qtdeMotores) {
        super(codigo, nome, modelo, anoFabricacao, pesoLiquido);
        this.cor = cor;
        this.anoModelo = anoModelo;
        this.eixos = eixos;
        this.pesoTotal = pesoTotal;
        this.assentos = assentos;
        this.rodas = rodas;
        this.fabricante = fabricante;
        this.potencia = potencia;
        this.tipoCombustivel = tipoCombustivel;
        this.nomeProprietario = nomeProprietario;
        this.cidadeUf = cidadeUf;
        this.estadoUf = estadoUf;
        this.tipoVeiculo = tipoVeiculo;
        this.qtdeOcupantes = qtdeOcupantes;
        this.qtdeMotores = qtdeMotores;
    }
    
    
}
