/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica.model;

import clinica.enums.EMaterialColetado;

/**
 *
 * @author steph
 */
public class Coleta {
    private int id;
    private Usuario coletor;
    private Usuario paciente;
    private boolean idade;
    private EMaterialColetado materialColetado;
    private boolean comorbidade;

    public Coleta() {
    }

    public Coleta(int id, Usuario coletor, Usuario paciente, boolean idade, EMaterialColetado materialColetado, boolean comorbidade) {
        this.id = id;
        this.coletor = coletor;
        this.paciente = paciente;
        this.idade = idade;
        this.materialColetado = materialColetado;
        this.comorbidade = comorbidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getColetor() {
        return coletor;
    }

    public void setColetor(Usuario coletor) {
        this.coletor = coletor;
    }

    public Usuario getPaciente() {
        return paciente;
    }

    public void setPaciente(Usuario paciente) {
        this.paciente = paciente;
    }

    public boolean getIdade() {
        return idade;
    }

    public void setIdade(boolean idade) {
        this.idade = idade;
    }

    public EMaterialColetado getMaterialColetado() {
        return materialColetado;
    }

    public void setMaterialColetado(EMaterialColetado materialColetado) {
        this.materialColetado = materialColetado;
    }

    public boolean getComorbidade() {
        return comorbidade;
    }

    public void setComorbidade(boolean comorbidade) {
        this.comorbidade = comorbidade;
    }
    
}
