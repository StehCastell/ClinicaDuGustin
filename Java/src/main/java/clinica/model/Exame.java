/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica.model;

import clinica.enums.EResultado;
import java.util.Date;

/**
 *
 * @author steph
 */
public class Exame {
    private int id;
    private Usuario responsavelTecnico;
    private Usuario paciente;
    private Coleta coleta;
    private int numeroTeste;
    private EResultado resultado;
    private Date data;

    public Exame() {
    }

    public Exame(int id, Usuario responsavelTecnico, Usuario paciente, Coleta coleta, int numeroTeste, EResultado resultado) {
        this.id = id;
        this.responsavelTecnico = responsavelTecnico;
        this.paciente = paciente;
        this.coleta = coleta;
        this.numeroTeste = numeroTeste;
        this.resultado = resultado;
        this.data = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getResponsavelTecnico() {
        return responsavelTecnico;
    }

    public void setResponsavelTecnico(Usuario responsavelTecnico) {
        this.responsavelTecnico = responsavelTecnico;
    }

    public Usuario getPaciente() {
        return paciente;
    }

    public void setPaciente(Usuario paciente) {
        this.paciente = paciente;
    }

    public Coleta getColeta() {
        return coleta;
    }

    public void setColeta(Coleta coleta) {
        this.coleta = coleta;
    }

    public int getNumeroTeste() {
        return numeroTeste;
    }

    public void setNumeroTeste(int numeroTeste) {
        this.numeroTeste = numeroTeste;
    }

    public EResultado getResultado() {
        return resultado;
    }

    public void setResultado(EResultado resultado) {
        this.resultado = resultado;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
