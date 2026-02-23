package model.Usuarios;

import model.Consultas.Consultas;

import java.util.ArrayList;
import java.util.List;

public class Paciente extends Usuarios{
    List<Consultas> historicoConsultas;

    public Paciente() {
        this.historicoConsultas = new ArrayList<>();
    }

    public Paciente(String nome, String CPF, String email, String senha){
        super(nome, CPF, email, senha);
    }

    public Paciente(Consultas consultas){
        historicoConsultas.add(consultas);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Informações do paciente");
        System.out.println("=======================");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + CPF);
        System.out.println("Email: " + email);
        System.out.println("Senha: " + senha);
        System.out.println("=======================");
    }
}
