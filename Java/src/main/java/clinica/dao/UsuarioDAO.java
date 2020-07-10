/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica.dao;

import clinica.connection.ConnectionFactory;
import clinica.enums.ETipoUsuario;
import clinica.interfaces.IDAO;
import clinica.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author steph
 */
public class UsuarioDAO implements IDAO<Usuario>{

    @Override
    public void salvar(Usuario objeto) throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "INSERT INTO usuario (login, senha, tipousuario, nome, datanasc, gruporisco, cidade) VALUES (?,?,?,?,?,?,?);";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setString(1, objeto.getLogin());
        pst.setString(2, objeto.getSenha());
        pst.setString(3, objeto.getTipoUsuario().toString());
        pst.setString(4, objeto.getNome());
        pst.setObject(5, objeto.getDataNasc() );
        Date datanasc = new Date();
        pst.setBoolean(6, objeto.getGrupoRisco());
        pst.setString(7, objeto.getCidade());

        pst.execute();
    }

    @Override
    public void alterar(Usuario objeto) throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "UPDATE usuario SET\n" +
                     "login = ?,\n" +
                     "senha = ?,\n" +
                     "tipousuario = ?,\n" +
                     "nome = ?,\n" +
                     "datanasc = ?,\n" +
                     "gruporisco = ?,\n" +
                     "cidade = ?\n" +
                     "WHERE id = ?;";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setString(1, objeto.getLogin());
        pst.setString(2, objeto.getSenha());
        pst.setString(3, objeto.getTipoUsuario().toString());
        pst.setString(4, objeto.getNome());
        pst.setObject(5, objeto.getDataNasc() );
        Date datanasc = new Date();
        pst.setBoolean(6, objeto.getGrupoRisco());
        pst.setString(7, objeto.getCidade());
        pst.setInt(8, objeto.getId());

        pst.execute();
    }

    @Override
    public void apagar(Usuario objeto) throws SQLException, ClassNotFoundException {
       Connection c = ConnectionFactory.getConnection();

        String sql = "DELETE FROM usuario WHERE id = ?;";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setInt(1, objeto.getId());

        pst.execute();
    }

    @Override
    public ArrayList<Usuario> buscarTodos() throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "SELECT * FROM usuario;";

        PreparedStatement pst = c.prepareStatement(sql);

        ResultSet resultado = pst.executeQuery();
        
        ArrayList<Usuario> lista = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        while (resultado.next()) {
            Usuario usuario = new Usuario();
            try {
                usuario.setId(resultado.getInt("id"));
                usuario.setLogin(resultado.getString("login"));
                usuario.setSenha(resultado.getString("senha"));
                usuario.setTipoUsuario(ETipoUsuario.valueOf(resultado.getString("tipousuario")));
                usuario.setNome(resultado.getString("nome"));
                usuario.setDataNasc(sdf.parse(resultado.getString("datanasc")));
                usuario.setGrupoRisco(resultado.getBoolean("gruporisco"));
                usuario.setCidade(resultado.getString("cidade"));
                lista.add(usuario);
            } catch (ParseException ex) {
                usuario.setDataNasc(new Date());
            }
        }
        return lista;
    }

    @Override
    public Usuario buscarPeloId(int id) throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "SELECT * FROM usuario Where id = ? ;";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setInt(1, id);

        ResultSet resultado = pst.executeQuery();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        
        Usuario usuario = new Usuario();
        if(resultado.next()){
            try {
                usuario.setId(resultado.getInt("id"));
                usuario.setLogin(resultado.getString("login"));
                usuario.setSenha(resultado.getString("senha"));
                usuario.setTipoUsuario(ETipoUsuario.valueOf(resultado.getString("tipousuario")));
                usuario.setNome(resultado.getString("nome"));
                usuario.setDataNasc(sdf.parse(resultado.getString("datanasc")));
                usuario.setGrupoRisco(resultado.getBoolean("gruporisco"));
                usuario.setCidade(resultado.getString("cidade"));
                return usuario;
            } catch (ParseException ex) {
                usuario.setDataNasc(new Date());
            }
        }
        else{
            return usuario;
        } 
        return null;
    }
    
    public  Usuario logar(String login, String senha, String tipoUsuario) throws SQLException, ClassNotFoundException, ParseException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "SELECT * FROM usuario Where login = ? and senha = ? and tipousuario = ?;";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setString(1, login);
        pst.setString(2, senha);
        pst.setString(3, tipoUsuario);

        ResultSet resultado = pst.executeQuery();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        
        Usuario usuario = new Usuario();
        if(resultado.next()){
            usuario.setId(resultado.getInt("id"));
            usuario.setLogin(resultado.getString("login"));
            usuario.setSenha(resultado.getString("senha"));
            usuario.setTipoUsuario(ETipoUsuario.valueOf(resultado.getString("tipousuario"))); 
            usuario.setNome(resultado.getString("nome"));
            usuario.setDataNasc(sdf.parse(resultado.getString("datanasc")));
            usuario.setGrupoRisco(resultado.getBoolean("gruporisco"));
            usuario.setCidade(resultado.getString("cidade"));      
            return usuario;
        }
        else{
            return null;
        }
    }
    
    public Usuario buscarPeloNome(String nome) throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "SELECT * FROM usuario Where nome like CONCAT( '%',?,'%');";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setString(1, nome);

        ResultSet resultado = pst.executeQuery();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        
        Usuario usuario = new Usuario();
        if(resultado.next()){
            try {
                usuario.setId(resultado.getInt("id"));
                usuario.setLogin(resultado.getString("login"));
                usuario.setSenha(resultado.getString("senha"));
                usuario.setTipoUsuario(ETipoUsuario.valueOf(resultado.getString("tipousuario")));
                usuario.setNome(resultado.getString("nome"));
                usuario.setDataNasc(sdf.parse(resultado.getString("datanasc")));
                usuario.setGrupoRisco(resultado.getBoolean("gruporisco"));
                usuario.setCidade(resultado.getString("cidade"));
                return usuario;
            } catch (ParseException ex) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            return usuario;
        } 
        return null;
    }
    
    public ArrayList<Usuario> buscarPacientes() throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "SELECT * FROM usuario Where tipousuario = 'PACIENTE';";

        PreparedStatement pst = c.prepareStatement(sql);

        ResultSet resultado = pst.executeQuery();
        
        ArrayList<Usuario> lista = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        while (resultado.next()) {
            try {
                Usuario usuario = new Usuario();
                usuario.setId(resultado.getInt("id"));
                usuario.setLogin(resultado.getString("login"));
                usuario.setSenha(resultado.getString("senha"));
                usuario.setTipoUsuario(ETipoUsuario.valueOf(resultado.getString("tipousuario")));
                usuario.setNome(resultado.getString("nome"));
                usuario.setDataNasc(sdf.parse(resultado.getString("datanasc")));
                usuario.setGrupoRisco(resultado.getBoolean("gruporisco"));
                usuario.setCidade(resultado.getString("cidade"));
                lista.add(usuario);
            } catch (ParseException ex) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lista;
    }
    
    public ArrayList<Usuario> buscarResponsaveisTecnicos() throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "SELECT * FROM usuario Where tipousuario = 'RESPONSAVELTECNICO';";

        PreparedStatement pst = c.prepareStatement(sql);

        ResultSet resultado = pst.executeQuery();
        
        ArrayList<Usuario> lista = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        while (resultado.next()) {
            try {
                Usuario usuario = new Usuario();
                usuario.setId(resultado.getInt("id"));
                usuario.setLogin(resultado.getString("login"));
                usuario.setSenha(resultado.getString("senha"));
                usuario.setTipoUsuario(ETipoUsuario.valueOf(resultado.getString("tipousuario")));
                usuario.setNome(resultado.getString("nome"));
                usuario.setDataNasc(sdf.parse(resultado.getString("datanasc")));
                usuario.setGrupoRisco(resultado.getBoolean("gruporisco"));
                usuario.setCidade(resultado.getString("cidade"));
                lista.add(usuario);
            } catch (ParseException ex) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lista;
    }
    
    public ArrayList<Usuario> buscarCadastros() throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "SELECT * FROM usuario Where tipousuario = 'CADASTRO';";

        PreparedStatement pst = c.prepareStatement(sql);

        ResultSet resultado = pst.executeQuery();
        
        ArrayList<Usuario> lista = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        while (resultado.next()) {
            try {
                Usuario usuario = new Usuario();
                usuario.setId(resultado.getInt("id"));
                usuario.setLogin(resultado.getString("login"));
                usuario.setSenha(resultado.getString("senha"));
                usuario.setTipoUsuario(ETipoUsuario.valueOf(resultado.getString("tipousuario")));
                usuario.setNome(resultado.getString("nome"));
                usuario.setDataNasc(sdf.parse(resultado.getString("datanasc")));
                usuario.setGrupoRisco(resultado.getBoolean("gruporisco"));
                usuario.setCidade(resultado.getString("cidade"));
                lista.add(usuario);
            } catch (ParseException ex) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lista;
    }
}
