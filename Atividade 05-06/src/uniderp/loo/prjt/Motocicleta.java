package uniderp.loo.prjt;

public class Motocicleta extends BasePlaca {
    
    private String escape;

    public String getEscape() {
        return escape;
    }

    public void setEscape(String escape) {
        this.escape = escape;
    }

    public Motocicleta(int codigo, String nome, String modelo, int anoFabricacao, double pesoLiquido, String cor,
            int anoModelo, int eixos, double pesoTotal, int assentos, int rodas, String fabricante, double potencia,
            String tipoCombustivel, String nomeProprietario, String cidadeUf, String estadoUf, String tipoVeiculo,
            int qtdeOcupantes, int qtdeMotores, String codigoRenavam, String placa, String chassi, String escape) {
        super(codigo, nome, modelo, anoFabricacao, pesoLiquido, cor, anoModelo, eixos, pesoTotal, assentos, rodas,
                fabricante, potencia, tipoCombustivel, nomeProprietario, cidadeUf, estadoUf, tipoVeiculo, qtdeOcupantes,
                qtdeMotores, codigoRenavam, placa, chassi);
        this.escape = escape;
    }
    
    @Override
    public void Imprimir(){
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano de Fabricaçao: " + this.anoFabricacao);
        System.out.println("Peso Liquido: " + this.pesoLiquido);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ano/Modelo: " +  this.anoModelo);
        System.out.println("Eixos: " + this.eixos);
        System.out.println("Peso Total: " + this.pesoTotal);
        System.out.println("Assentos: " + this.assentos);
        System.out.println("Rodas: " + this.rodas);
        System.out.println("Fabricante: " + this.fabricante);
        System.out.println("Potencia: " + this.potencia);
        System.out.println("Tipo De Combustivel: " +this.tipoCombustivel);
        System.out.println("Nome do Proprietario: " + this.nomeProprietario);
        System.out.println("Cidade Uf: " +this.cidadeUf);
        System.out.println("Estado Uf: " + this.estadoUf);
        System.out.println("Tipo de Veiculo: " + this.tipoVeiculo);
        System.out.println("Quantidade de ocupantes: " +this.qtdeOcupantes );
        System.out.println("Quantidade de Motores: " + this.qtdeMotores);
        System.out.println("Codigo Renavam: " + this.codigoRenavam);
        System.out.println("Placa: " + this.placa);
        System.out.println("Chassi: " + this.chassi);
        System.out.println("Escape:" + this.escape);
        
}
}
