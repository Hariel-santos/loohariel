package uniderp.loo.estagiario;

import java.time.LocalDate;

public class Passageiro extends BasePessoa{
    
    private String numeroCartao;
    private String documento;
    public String getNumeroCartao() {
        return numeroCartao;
    }
    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public Passageiro(int codigo, String registro, String nome, String email, String telefone, LocalDate dataNascimento,
            String usuario, String senha, String numeroCartao, String documento) {
        super(codigo, registro, nome, email, telefone, dataNascimento, usuario, senha);
        this.numeroCartao = numeroCartao;
        this.documento = documento;
    }

}
