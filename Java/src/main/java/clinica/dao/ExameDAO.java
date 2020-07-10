/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica.dao;

import clinica.connection.ConnectionFactory;
import clinica.enums.EResultado;
import clinica.interfaces.IDAO;
import clinica.model.Exame;
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
public class ExameDAO implements IDAO<Exame>{

    @Override
    public void salvar(Exame objeto) throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "INSERT INTO exame (idresponsaveltecnico, idpaciente, idcoleta, numeroteste, resultado, data) "
                   + "VALUES (?,?,?,?,?,?);";

        PreparedStatement pst = c.prepareStatement(sql);
            
        pst.setInt(1, objeto.getResponsavelTecnico().getId());
        pst.setInt(2, objeto.getPaciente().getId());
        pst.setInt(3, objeto.getColeta().getId());
        pst.setInt(4, objeto.getNumeroTeste());
        pst.setString(5, objeto.getResultado().toString());
        pst.setObject(6, new Date());
        pst.execute();
    }

    @Override
    public void alterar(Exame objeto) throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "UPDATE exame SET\n" +
                     "idresponsaveltecnico = ?,\n" +
                     "idpaciente = ?,\n" +
                     "idcoleta = ?,\n" +
                     "numeroteste = ?,\n" +
                     "resultado = ?,\n" +
                     "data = ?\n" +
                     "WHERE id = ?;";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setInt(1, objeto.getResponsavelTecnico().getId());
        pst.setInt(2, objeto.getPaciente().getId());
        pst.setInt(3, objeto.getColeta().getId());
        pst.setInt(4, objeto.getNumeroTeste());
        pst.setString(5, objeto.getResultado().toString());
        pst.setObject(6, new Date());
        pst.setInt(7, objeto.getId());

        pst.execute();}

    @Override
    public void apagar(Exame objeto) throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "DELETE FROM exame WHERE id = ?;";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setInt(1, objeto.getId());

        pst.execute();
    }

    @Override
    public ArrayList<Exame> buscarTodos() throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "SELECT * FROM exame;";

        PreparedStatement pst = c.prepareStatement(sql);

        ResultSet resultado = pst.executeQuery();
        
        ArrayList<Exame> lista = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        while (resultado.next()) {
            try {
                Exame exame = new Exame();
                exame.setId(resultado.getInt("id"));
                exame.setResponsavelTecnico(new UsuarioDAO().buscarPeloId(resultado.getInt("idresponsaveltecnico")));
                exame.setPaciente(new UsuarioDAO().buscarPeloId(resultado.getInt("idpaciente")));
                exame.setColeta(new ColetaDAO().buscarPeloId(resultado.getInt("idcoleta")));
                exame.setNumeroTeste(resultado.getInt("numeroteste"));
                exame.setResultado(EResultado.valueOf(resultado.getString("resultado")));
                exame.setData(sdf.parse(resultado.getString("data")));
                lista.add(exame);
            } catch (ParseException ex) {
                Logger.getLogger(ExameDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lista;
    }

    @Override
    public Exame buscarPeloId(int id) throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "SELECT * FROM exame Where exame Where id = ? ;";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setInt(1, id);

        ResultSet resultado = pst.executeQuery();
        
        Exame exame = new Exame();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        
        if(resultado.next()){
            try {
                exame.setId(resultado.getInt("id"));
                exame.setResponsavelTecnico(new UsuarioDAO().buscarPeloId(resultado.getInt("idresponsaveltecnico")));
                exame.setPaciente(new UsuarioDAO().buscarPeloId(resultado.getInt("idpaciente")));
                exame.setColeta(new ColetaDAO().buscarPeloId(resultado.getInt("idcoleta")));
                exame.setNumeroTeste(resultado.getInt("numeroteste"));
                exame.setResultado(EResultado.valueOf(resultado.getString("resultado")));
                exame.setData(sdf.parse(resultado.getString("data")));
                return exame;
            } catch (ParseException ex) {
                Logger.getLogger(ExameDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            return exame;
        }        
        return null;
    }    
    
    public ArrayList<Exame> buscarPeloPacienteId(int id) throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "SELECT * FROM exame Where idpaciente = ?;";

        PreparedStatement pst = c.prepareStatement(sql);
        
        pst.setInt(1, id);

        ResultSet resultado = pst.executeQuery();
        
        ArrayList<Exame> lista = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        while (resultado.next()) {
            try {
                Exame exame = new Exame();
                exame.setId(resultado.getInt("id"));
                exame.setResponsavelTecnico(new UsuarioDAO().buscarPeloId(resultado.getInt("idresponsaveltecnico")));
                exame.setPaciente(new UsuarioDAO().buscarPeloId(resultado.getInt("idpaciente")));
                exame.setColeta(new ColetaDAO().buscarPeloId(resultado.getInt("idcoleta")));
                exame.setNumeroTeste(resultado.getInt("numeroteste"));
                exame.setResultado(EResultado.valueOf(resultado.getString("resultado")));
                exame.setData(sdf.parse(resultado.getString("data")));
                lista.add(exame);
            } catch (ParseException ex) {
                Logger.getLogger(ExameDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lista;
    }
    
    public ArrayList<Exame> buscarDataAtual() throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "SELECT * FROM clinica.exame where exame.data = curdate()";

        PreparedStatement pst = c.prepareStatement(sql);
    
        ResultSet resultado = pst.executeQuery();
        
        ArrayList<Exame> lista = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        while (resultado.next()) {
            try {
                Exame exame = new Exame();
                exame.setId(resultado.getInt("id"));
                exame.setResponsavelTecnico(new UsuarioDAO().buscarPeloId(resultado.getInt("idresponsaveltecnico")));
                exame.setPaciente(new UsuarioDAO().buscarPeloId(resultado.getInt("idpaciente")));
                exame.setColeta(new ColetaDAO().buscarPeloId(resultado.getInt("idcoleta")));
                exame.setNumeroTeste(resultado.getInt("numeroteste"));
                exame.setResultado(EResultado.valueOf(resultado.getString("resultado")));
                exame.setData(sdf.parse(resultado.getString("data")));
                lista.add(exame);
            } catch (ParseException ex) {
                Logger.getLogger(ExameDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lista;
    }
    
    public int buscarQuantidadePacientesDataAtual() throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "SELECT count(distinct idpaciente) as num FROM clinica.exame where exame.data = curdate()";

        PreparedStatement pst = c.prepareStatement(sql);
    
        ResultSet resultado = pst.executeQuery();
        
        int numero = 0;

        while (resultado.next()) {
            numero = resultado.getInt("num");
        }
        return numero;
    }
}
