/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica.model;

import clinica.enums.ETipoUsuario;
import java.util.Date;

/**
 *
 * @author steph
 */
public class Usuario {
    private int id;
    private ETipoUsuario tipoUsuario;
    private String login;
    private String senha;
    private String nome;
    private Date dataNasc;
    private boolean grupoRisco;
    private String cidade;

    public Usuario() {
    }

    public Usuario(int id, ETipoUsuario tipoUsuario, String login, String senha, String nome, Date dataNasc, boolean grupoRisco, String cidade) {
        this.id = id;
        this.tipoUsuario = tipoUsuario;
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.grupoRisco = grupoRisco;
        this.cidade = cidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ETipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(ETipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public boolean getGrupoRisco() {
        return grupoRisco;
    }

    public void setGrupoRisco(boolean grupoRisco) {
        this.grupoRisco = grupoRisco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
}
