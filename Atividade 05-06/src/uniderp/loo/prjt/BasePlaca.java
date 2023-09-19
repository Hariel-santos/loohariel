package uniderp.loo.prjt;

public abstract class BasePlaca extends BaseVeiculos{
    protected String codigoRenavam;
    protected String placa;
    protected String chassi;
    public String getCodigoRenavam() {
        return codigoRenavam;
    }
    public void setCodigoRenavam(String codigoRenavam) {
        this.codigoRenavam = codigoRenavam;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public BasePlaca(int codigo, String nome, String modelo, int anoFabricacao, double pesoLiquido, String cor,
            int anoModelo, int eixos, double pesoTotal, int assentos, int rodas, String fabricante, double potencia,
            String tipoCombustivel, String nomeProprietario, String cidadeUf, String estadoUf, String tipoVeiculo,
            int qtdeOcupantes, int qtdeMotores, String codigoRenavam, String placa, String chassi) {
        super(codigo, nome, modelo, anoFabricacao, pesoLiquido, cor, anoModelo, eixos, pesoTotal, assentos, rodas,
                fabricante, potencia, tipoCombustivel, nomeProprietario, cidadeUf, estadoUf, tipoVeiculo, qtdeOcupantes,
                qtdeMotores);
        this.codigoRenavam = codigoRenavam;
        this.placa = placa;
        this.chassi = chassi;
    }

    
}
