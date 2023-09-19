package uniderp.loo.prjt;

public abstract class BasePorta extends BasePlaca {

    protected int portas;

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public BasePorta(int codigo, String nome, String modelo, int anoFabricacao, double pesoLiquido, String cor,
            int anoModelo, int eixos, double pesoTotal, int assentos, int rodas, String fabricante, double potencia,
            String tipoCombustivel, String nomeProprietario, String cidadeUf, String estadoUf, String tipoVeiculo,
            int qtdeOcupantes, int qtdeMotores, String codigoRenavam, String placa, String chassi, int portas) {
        super(codigo, nome, modelo, anoFabricacao, pesoLiquido, cor, anoModelo, eixos, pesoTotal, assentos, rodas,
                fabricante, potencia, tipoCombustivel, nomeProprietario, cidadeUf, estadoUf, tipoVeiculo, qtdeOcupantes,
                qtdeMotores, codigoRenavam, placa, chassi);
        this.portas = portas;
    }

    
}
