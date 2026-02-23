package model.Usuarios;

public class ADM extends Usuarios{

    private boolean nivelAcesso;

    public ADM(){
        super();
        this.nivelAcesso = false;
    }

    public ADM(String nome, String CPF, String email, String senha, boolean nivelAcesso){
        super(nome, CPF, email, senha);
        this.nivelAcesso = nivelAcesso;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Informações do ADM");
        System.out.println("==========================");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + CPF);
        System.out.println("Email: " + email);
        System.out.println("Senha: " + senha);
        System.out.println("Nível acesso: " + nivelAcesso);
        System.out.println("==========================");
    }

    public boolean isNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(boolean nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
}
