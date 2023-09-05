package uniderp.loo.estagiario;

import java.time.LocalDate;

public class Funcionario extends BasePessoa{
    private String contaCorrente;
    private String cracha;
    public String getContaCorrente() {
        return contaCorrente;
    }
    public void setContaCorrente(String contaCorrente) {
        this.contaCorrente = contaCorrente;
    }
    public String getCracha() {
        return cracha;
    }
    public void setCracha(String cracha) {
        this.cracha = cracha;
    }
    public Funcionario(int codigo, String registro, String nome, String email, String telefone,
            LocalDate dataNascimento, String usuario, String senha, String contaCorrente, String cracha) {
        super(codigo, registro, nome, email, telefone, dataNascimento, usuario, senha);
        this.contaCorrente = contaCorrente;
        this.cracha = cracha;
    }
    
}
