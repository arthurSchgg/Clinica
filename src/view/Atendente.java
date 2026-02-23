package view;

import java.util.Scanner;

public class Atendente {
    Scanner sc = new Scanner(System.in);


    //Menu generico
    public int MenuPrincipal(){
        System.out.println("+==========================+");
        System.out.println("|     Hospital dos Zé's    |");
        System.out.println("+==========================+");
        System.out.println("| [1] Cadastro             |");
        System.out.println("| [0] Sair                 |");
        System.out.println("+==========================+");
        System.out.println("Escolha uma opção: ");
        int op = sc.nextInt();
        sc.nextLine();
        return op;
    }

    public int subMenuGenerico(){
        System.out.println("+==========================+");
        System.out.println("|      Nível de Acesso     |");
        System.out.println("+==========================+");
        System.out.println("| [1] Paciente             |");
        System.out.println("| [2] Médico               |");
        System.out.println("| [3] Administrador        |");
        System.out.println("| [0] Voltar               |");
        System.out.println("+==========================+");
        System.out.print("Escolha seu nível: ");
        int op = sc.nextInt();
        sc.nextLine();
        return op;
    }

    public int MenuPaciente(){
        System.out.println("+====================================+");
        System.out.println("|     Hospital dos Zé's (PACIENTE)   |");
        System.out.println("+====================================+");
        System.out.println("| [1] Agendar consulta               |");
        System.out.println("| [2] Consultar histórico            |");
        System.out.println("| [3] Realizar pagamento             |");
        System.out.println("| [0] Sair                           |");
        System.out.println("+====================================+");
        System.out.println("Escolha uma opção: ");
        int op = sc.nextInt();
        sc.nextLine();
        return op;
    }

    public int MenuMedico(){
        System.out.println("+=================================+");
        System.out.println("|     Hospital dos Zé's (MÉDICO)  |");
        System.out.println("+=================================+");
        System.out.println("| [1] Visualizar agenda           |");
        System.out.println("| [2] Finalizar consultas         |");
        System.out.println("| [0] Sair                        |");
        System.out.println("+=================================+");
        System.out.println("Escolha uma opção: ");
        int op = sc.nextInt();
        sc.nextLine();
        return op;
    }

    public int MenuADM(){
        System.out.println("+==================================+");
        System.out.println("|      Hospital dos Zé's  (ADM)    |");
        System.out.println("+==================================+");
        System.out.println("| [1] Cadastrar médicos            |");
        System.out.println("| [2] Listar todos os atendimentos |");
        System.out.println("| [0] Sair                         |");
        System.out.println("+==================================+");
        System.out.println("Escolha uma opção: ");
        int op = sc.nextInt();
        sc.nextLine();
        return op;
    }
}
