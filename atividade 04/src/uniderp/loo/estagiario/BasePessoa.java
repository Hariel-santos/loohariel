package uniderp.loo.estagiario;

import java.time.LocalDate;

public abstract class BasePessoa extends BaseDados{
    
    protected String nome;
    protected String email;
    protected String telefone;
    protected LocalDate dataNascimento;
    protected String usuario;
    protected String senha;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public BasePessoa(int codigo, String registro, String nome, String email, String telefone, LocalDate dataNascimento,
            String usuario, String senha) {
        super(codigo, registro);
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.usuario = usuario;
        this.senha = senha;
    }

    
}
