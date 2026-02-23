package model.Consultas;

import model.Usuarios.Medico;
import model.Usuarios.Paciente;

public abstract class Consultas {

    protected final static int codigo = 0;
    Paciente paciente = new Paciente();
    Medico medico = new Medico();
    protected String data;
    protected double valor;
    protected Status status;

    public Consultas(Paciente paciente, Medico medico, String data, double valor, Status status){
        this.paciente = paciente;
        this.medico = medico;
        this.data = data;
        this.valor = valor;
        this.status = status;
    }

    public Consultas() {
        this.paciente = new Paciente();
        this.medico = new Medico();
        this.data = "00/00/0000";
        this.valor = 0.0;
        this.status = Status.AGENDADO;
    }

    public enum Status {
        AGENDADO,
        CONFIRMADO,
        EM_ATENDIMENTO,
        CONCLUIDO,
        CANCELADO,
        NAO_COMPARECEU
    }

    public abstract String detalhesConsulta();

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
