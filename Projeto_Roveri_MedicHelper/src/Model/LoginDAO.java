/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Gustavo Canova
 */
public class LoginDAO {

    private Connection con;
    private PreparedStatement cmd;

    public LoginDAO() throws SQLException {

        this.con = Conexao.Conectar();
        this.con.setAutoCommit(false);
    }
    public boolean login(Paciente log) throws SQLException {
        
        try {
            String sql = "SELECT * from cadpaciente WHERE  ID_Paciente = ? and senha = ?";

            cmd = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            cmd.setInt(1, log.getID_Paciente());
            cmd.setString(2, log.getSenha());

            if (cmd.executeQuery().next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {

            return false;
        } finally {
            Conexao.Desconectar(con);
        }
    }
    public boolean loginMedico(Medico log) throws SQLException {
        
        try {
            String sql = "SELECT * from cadmedico WHERE  ID_Medico=? and senha = ?";

            cmd = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            cmd.setInt(1, log.getID_Medico());
            cmd.setString(2, log.getSenha());

            if (cmd.executeQuery().next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {

            return false;
        } finally {
            Conexao.Desconectar(con);
        }

    }

    public boolean loginAdministrador(Administrador log) throws SQLException {
        
        try {
            String sql = "SELECT * from cadadm WHERE  ID_Adm = ? and senha = ?";

            cmd = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            cmd.setInt(1, log.getID_Adm());
            cmd.setString(2, log.getSenha());

            if (cmd.executeQuery().next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {

            return false;
        } finally {
            Conexao.Desconectar(con);
        }
    }
}
    

