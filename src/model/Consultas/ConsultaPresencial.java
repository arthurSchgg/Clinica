package model.Consultas;

import model.Usuarios.Medico;
import model.Usuarios.Paciente;

public class ConsultaPresencial extends Consultas{

    private int sala;

    public ConsultaPresencial(){
        super();
        this.sala = 0;
    }

    public ConsultaPresencial(int codigo, Paciente paciente, Medico medico, String data, double valor,
                              Status status, int sala){
        super(paciente, medico, data, valor, status);
        this.sala = sala;
    }

    @Override
    public String detalhesConsulta() {
        return "Código da consulta: " + codigo + ", Paciente: " + paciente + ", Médico: " + medico + ", Data: " + data +
                ", Valor: R$" + valor + ", Status: " + status + ", Sala: " + sala;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }
}
