package model.Usuarios;

public class Medico extends Usuarios{

    private int crm;
    private Especialidade especialidade;


    public Medico(String nome, String CPF, String email, String senha, Especialidade especialidade){
        super(nome, CPF, email, senha);
        this.crm = 0;
        this.especialidade = especialidade;
    }

    public Medico() {
        super();
        this.crm = 0;
        this.especialidade = especialidade.NAO_INFORMADA;
    }

    public enum Especialidade{
        CARDIOLOGIA,
        DERMATOLOGIA,
        ENDOCRINOLOGIA,
        GASTROENTEROLOGIA,
        GERIATRIA,
        GINECOLOGIA_E_OBSTETRICIA,
        HEMATOLOGIA,
        INFECTOLOGIA,
        NEFROLOGIA,
        NEUROLOGIA,
        OFTALMOLOGIA,
        ONCOLOGIA,
        ORTOPEDIA_E_TRAUMATOLOGIA,
        OTORRINOLARINGOLOGIA,
        PEDIATRIA,
        PNEUMOLOGIA,
        PSIQUIATRIA,
        REUMATOLOGIA,
        NAO_INFORMADA,
        UROLOGIA
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Informações do Médico");
        System.out.println("==========================");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + CPF);
        System.out.println("Email: " + email);
        System.out.println("Senha: " + senha);
        System.out.println("CRM: " + crm);
        System.out.println("Especialidade: " + especialidade);
        System.out.println("==========================");
    }
}
