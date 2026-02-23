package model.Usuarios;

public abstract class Usuarios {

    protected String nome;
    protected String CPF;
    protected String email;
    protected String senha;

    public Usuarios(){
        this.nome = "";
        this.CPF = "";
        this.email = "";
        this.senha = "";
    }

    public Usuarios(String nome, String CPF, String email, String senha){
        this.nome = nome;
        this.CPF = CPF;
        this.email = email;
        this.senha = senha;
    }

    public abstract void mostrarInfo();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
