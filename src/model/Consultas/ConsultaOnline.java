package model.Consultas;

import model.Usuarios.Medico;
import model.Usuarios.Paciente;

public class ConsultaOnline extends Consultas{

    private String linkReuniao;

    public ConsultaOnline(){
        super();
        this.linkReuniao = "";
    }

    public ConsultaOnline(int codigo, Paciente paciente, Medico medico, String data, double valor,
                          Status status, String linkReuniao){
        super(paciente, medico, data, valor, status);
        this.linkReuniao = linkReuniao;
    }

    @Override
    public String detalhesConsulta() {
        return "Código da consulta: " + codigo + ", Paciente: " + paciente + ", Médico: " + medico + ", Data: " + data +
                ", Valor: R$" + valor +", Status: " + status + "Link reunião: " + linkReuniao;
    }

    public String getLinkReuniao() {
        return linkReuniao;
    }

    public void setLinkReuniao(String linkReuniao) {
        this.linkReuniao = linkReuniao;
    }
}
