package model.Consultas;

import model.Usuarios.Medico;
import model.Usuarios.Paciente;

public class ConsultaEmergencia extends Consultas{

    private boolean nivelUrgencia;

    public ConsultaEmergencia(){
        super();
        this.nivelUrgencia = false;
    }

    public ConsultaEmergencia(int codigo, Paciente paciente, Medico medico, String data, double valor,
                              Status status, boolean nivelUrgencia){
        super(paciente, medico, data, valor, status);
        this.nivelUrgencia = nivelUrgencia;
    }

    @Override
    public String detalhesConsulta() {
        return "Código da consulta: " + codigo + ", Paciente: " + paciente + ", Médico: " + medico + " Data: "
                + data + ", " + "Valor: R$" + valor + ", Status: " + status + ", Nível de urgência: " + nivelUrgencia;
    }

    public boolean isNivelUrgencia() {
        return nivelUrgencia;
    }

    public void setNivelUrgencia(boolean nivelUrgencia) {
        this.nivelUrgencia = nivelUrgencia;
    }
}

