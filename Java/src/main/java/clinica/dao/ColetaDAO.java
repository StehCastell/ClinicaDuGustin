/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica.dao;

import clinica.connection.ConnectionFactory;
import clinica.enums.EMaterialColetado;
import clinica.interfaces.IDAO;
import clinica.model.Coleta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author steph
 */
public class ColetaDAO implements IDAO<Coleta>{

    @Override
    public void salvar(Coleta objeto) throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "INSERT INTO coleta (idcadastro, idpaciente, idade, materialcoletado, comorbidade) VALUES (?,?,?,?,?);";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setInt(1, objeto.getPaciente().getId());
        pst.setInt(2, objeto.getPaciente().getId());
        pst.setBoolean(3, objeto.getIdade());
        pst.setString(4, objeto.getMaterialColetado().toString());
        pst.setBoolean(5, objeto.getComorbidade());

        pst.execute();}

    @Override
    public void alterar(Coleta objeto) throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "UPDATE coleta SET\n" +
                     "idcadastro = ?,\n" +
                     "idpaciente = ?,\n" +
                     "idade = ?,\n" +
                     "materialcoletado = ?,\n" +
                     "comorbidade = ?\n" +
                     "WHERE id = ?;";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setInt(1, objeto.getPaciente().getId());
        pst.setInt(2, objeto.getPaciente().getId());
        pst.setBoolean(3, objeto.getIdade());
        pst.setString(4, objeto.getMaterialColetado().toString());
        pst.setBoolean(5, objeto.getComorbidade());

        pst.execute();
    }

    @Override
    public void apagar(Coleta objeto) throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "DELETE FROM coleta WHERE id = ?;";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setInt(1, objeto.getId());

        pst.execute();
    }

    @Override
    public ArrayList<Coleta> buscarTodos() throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "SELECT * FROM coleta;";

        PreparedStatement pst = c.prepareStatement(sql);

        ResultSet resultado = pst.executeQuery();
        
        ArrayList<Coleta> lista = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        while (resultado.next()) {
            Coleta coleta = new Coleta();
            coleta.setId(resultado.getInt("id"));
            coleta.setColetor(new UsuarioDAO().buscarPeloId(resultado.getInt("idcadastro")));
            coleta.setPaciente(new UsuarioDAO().buscarPeloId(resultado.getInt("idpaciente")));
            coleta.setIdade(resultado.getBoolean("idade"));
            coleta.setMaterialColetado(EMaterialColetado.valueOf(resultado.getString("materialcoletado")));
            coleta.setComorbidade(resultado.getBoolean("comorbidade"));
            lista.add(coleta);
        }
        return lista;
    }

    @Override
    public Coleta buscarPeloId(int id) throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();
        String sql = "SELECT * FROM coleta Where id = ? ;";
        
        PreparedStatement pst = c.prepareStatement(sql);
        pst.setInt(1, id);
        
        ResultSet resultado = pst.executeQuery();
        Coleta coleta = new Coleta();
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        
        if(resultado.next()){
            coleta.setId(resultado.getInt("id"));
            coleta.setColetor(new UsuarioDAO().buscarPeloId(resultado.getInt("idcadastro")));
            coleta.setPaciente(new UsuarioDAO().buscarPeloId(resultado.getInt("idpaciente")));
            coleta.setIdade(resultado.getBoolean("idade"));
            coleta.setMaterialColetado(EMaterialColetado.valueOf(resultado.getString("materialcoletado")));
            coleta.setComorbidade(resultado.getBoolean("comorbidade"));
            return coleta;
        }
        else{
            return coleta;
        }
    }
}
