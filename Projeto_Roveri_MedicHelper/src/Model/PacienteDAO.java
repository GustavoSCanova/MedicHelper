
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.*;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import Model.Paciente;
import Connection.Conexao;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.Date;

/**
 *
 * @author Gustavo Canova
 */
public class PacienteDAO {

    private Connection con;
    private PreparedStatement cmd;

    public PacienteDAO() throws SQLException {

        this.con = Conexao.Conectar();
        this.con.setAutoCommit(false);
    }

    public boolean inserir(Paciente pac) throws SQLException {
        
        try {
            String sql = "INSERT INTO cadpaciente (ID_Paciente,nome, datanasc, rg, cpf, senha) VALUES(?,?,?,?,?,?);";

            cmd = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            cmd.setInt(1, pac.getID_Paciente());
            cmd.setString(2, pac.getNome());
            cmd.setString(3, pac.getDatanasc());
            cmd.setString(4, pac.getRg());
            cmd.setString(5, pac.getCpf());
            cmd.setString(6, pac.getSenha());

            if (cmd.executeUpdate() > 0) {
                con.commit();
                return true;
            } else {
                con.rollback();
                return false;
            }
        } catch (Exception e) {
            con.rollback();
            return false;
        } finally {
            Conexao.Desconectar(con);
        }
    }

    public boolean atualizar(Paciente pac) throws SQLException {
        try {
            String sql = "UPDATE cadpaciente SET  nome=?, datanasc=?, rg=?, cpf=?, senha=? WHERE ID_Paciente=?;";

            cmd = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            cmd.setString(1, pac.getNome());
            cmd.setString(2, pac.getDatanasc());
            cmd.setString(3, pac.getRg());
            cmd.setString(4, pac.getCpf());
            cmd.setString(5, pac.getSenha());
            cmd.setInt(6, pac.getID_Paciente());

            if (cmd.executeUpdate() > 0) {
                con.commit();
                return true;
            } else {
                con.rollback();
                return false;
            }
        } catch (Exception e) {
            con.rollback();
            return false;
        } finally {
            Conexao.Desconectar(con);
        }

    }

    public ArrayList<Paciente> listar() {
        try {
            String sql = "SELECT * FROM cadpaciente ORDER BY 1  ";
            cmd = con.prepareStatement(sql);
            ResultSet rs = cmd.executeQuery();
            ArrayList<Paciente> lista = new ArrayList<>();
            while (rs.next()) {
                Paciente pac = new Paciente();
                pac.setID_Paciente(rs.getInt("ID_Paciente"));
                pac.setNome(rs.getString("nome"));
                pac.setDatanasc(rs.getString("datanasc"));
                pac.setRg(rs.getString("rg"));
                pac.setCpf(rs.getString("cpf"));
                pac.setSenha(rs.getString("senha"));
                lista.add(pac);
            }
            return lista;
        } catch (Exception e) {
            return null;
        } finally {
            Conexao.Desconectar(con);
        }
    }

    public ArrayList<Paciente> listar(int pc) {
        try {
            String sql = "SELECT * FROM cadpaciente WHERE ID_Paciente = ? ORDER BY 1";
            cmd = con.prepareStatement(sql);
            cmd.setInt(6, pc);
            ResultSet rs = cmd.executeQuery();
            ArrayList<Paciente> lista = new ArrayList<>();
            while (rs.next()) {
                Paciente pac = new Paciente();
                pac.setID_Paciente(rs.getInt("ID_Paciente"));
                pac.setNome(rs.getString("nome"));
                pac.setDatanasc(rs.getString("datanasc"));
                pac.setRg(rs.getString("rg"));
                pac.setCpf(rs.getString("cpf"));
                pac.setSenha(rs.getString("senha"));
                lista.add(pac);
            }
            return lista;
        } catch (Exception e) {
            return null;
        } finally {
            Conexao.Desconectar(con);
        }
    }

    public boolean deletar(Paciente pac) throws SQLException {

        try {
            String sql = "DELETE FROM cadpaciente WHERE ID_Paciente=?";

            cmd = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            cmd.setInt(1, pac.getID_Paciente());

            if (cmd.executeUpdate() > 0) {
                con.commit();
                return true;
            } else {
                con.rollback();
                return false;
            }
        } catch (Exception e) {
            con.rollback();
            return false;
        } finally {
            Conexao.Desconectar(con);
        }
    }

}