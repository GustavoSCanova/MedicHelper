/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Gustavo Canova
 */
public class ConsultaDAO {

    private Connection con;
    private PreparedStatement cmd;

    public ConsultaDAO() throws SQLException {

        this.con = Conexao.Conectar();
        this.con.setAutoCommit(false);
    }

    public boolean inserir(Consulta cons) throws SQLException {

        try {
            String sql = "INSERT INTO consulta (ID_Medico,ID_Paciente,dataconsulta) VALUES(?,?,?);";

            cmd = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            cmd.setString(1, cons.getID_Medico());
            cmd.setString(2, cons.getID_Paciente());
            cmd.setString(3, cons.getDataconsulta());

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
    public boolean atualizar(Consulta cons) throws SQLException {
        try {
            String sql = "UPDATE consulta SET  ID_Consulta=?, ID_Medico=?,ID_Paciente=?,dataconsulta, WHERE ID_Paciente=?;";

            cmd = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

             
            cmd.setString(1, cons.getID_Consulta());
            cmd.setString(2, cons.getID_Medico());
            cmd.setString(3, cons.getID_Paciente());
            cmd.setString(4, cons.getDataconsulta());
            cmd.setString(5, cons.getID_Paciente());

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

      public ArrayList<Consulta> listarcons() {
        try {
            String sql = "SELECT cadpaciente.nome AS 'Nome Paciente', cadmedico.nome AS 'Nome Medico', dataconsulta AS 'Data da consulta' FROM consulta INNER JOIN cadpaciente ON (cadpaciente.ID_Paciente = consulta.ID_Paciente) INNER JOIN cadmedico ON (cadmedico.ID_Medico = consulta.ID_Medico)  ORDER BY 1  ";
            cmd = con.prepareStatement(sql);
            ResultSet rs = cmd.executeQuery();
            ArrayList<Consulta> listaconsulta = new ArrayList<>();
            while (rs.next()) {
                Consulta cons = new Consulta();
                
                cons.setID_Paciente(rs.getString("Nome Paciente"));
                cons.setID_Medico(rs.getString("Nome Medico"));
                cons.setDataconsulta(rs.getString("Data da consulta"));
                listaconsulta.add(cons);
            }
            
            return listaconsulta;
        } catch (Exception e) {
            return null;
        } finally {
            Conexao.Desconectar(con);
        }
      }

      public ArrayList<Consulta> listarconsulta(int pc) {
        try {
            String sql = "SELECT cadpaciente.nome AS 'Nome Paciente', cadmedico.nome AS 'Nome Medico', dataconsulta AS 'Data da consulta' FROM consulta INNER JOIN cadpaciente ON (cadpaciente.ID_Paciente = consulta.ID_Paciente) INNER JOIN cadmedico ON (cadmedico.ID_Medico = consulta.ID_Medico)";
            cmd = con.prepareStatement(sql);
            cmd.setInt(6, pc);
            ResultSet rs = cmd.executeQuery();
            ArrayList<Consulta> listaconsulta = new ArrayList<>();
            while (rs.next()) {
                Consulta cons = new Consulta();
                cons.setID_Paciente(rs.getString("Nome Paciente"));
                cons.setID_Medico(rs.getString("Nome Medico"));
                cons.setDataconsulta(rs.getString("Data da consulta"));
                listaconsulta.add(cons);
            }
            
            return listaconsulta;
        } catch (Exception e) {
            return null;
        } finally {
            Conexao.Desconectar(con);
        }
    }
      public ArrayList<Consulta> listarcons1() {
        try {
            String sql = "SELECT ID_Consulta, cadpaciente.nome AS 'Nome Paciente', cadmedico.nome AS 'Nome Medico', dataconsulta AS 'Data da consulta' FROM consulta INNER JOIN cadpaciente ON (cadpaciente.ID_Paciente = consulta.ID_Paciente) INNER JOIN cadmedico ON (cadmedico.ID_Medico = consulta.ID_Medico)  ORDER BY 1  ";
            cmd = con.prepareStatement(sql);
            ResultSet rs = cmd.executeQuery();
            ArrayList<Consulta> listaconsulta = new ArrayList<>();
            while (rs.next()) {
                Consulta cons = new Consulta();
                cons.setID_Consulta(rs.getString("ID_Consulta"));
                cons.setID_Paciente(rs.getString("Nome Paciente"));
                cons.setID_Medico(rs.getString("Nome Medico"));
                cons.setDataconsulta(rs.getString("Data da consulta"));
                listaconsulta.add(cons);
            }
            
            return listaconsulta;
        } catch (Exception e) {
            return null;
        } finally {
            Conexao.Desconectar(con);
        }
      }
    
       public boolean deletar(Consulta delcons) throws SQLException {

        try {
            String sql = "DELETE FROM consulta WHERE ID_Consulta = ?";

            cmd = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            
            cmd.setString(1, delcons.getID_Consulta());
            

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


