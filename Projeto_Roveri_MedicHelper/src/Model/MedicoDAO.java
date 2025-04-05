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

/**
 *
 * @author mahs
 */
public class MedicoDAO {
    private Connection con;
    private PreparedStatement cmd;
    
    public MedicoDAO() throws SQLException {

        this.con = Conexao.Conectar();
        this.con.setAutoCommit(false);
    }

    public boolean inserir(Medico med) throws SQLException {
        try {
            String sql = "INSERT INTO cadmedico (ID_Medico, nome, datanasc, especialidade,senha) VALUES(?,?,?,?,?);";

            cmd = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            cmd.setInt(1, med.getID_Medico());
            cmd.setString(2, med.getNome());
            cmd.setString(3, med.getDatanasc());
            cmd.setString(4, med.getEspecialidade());
            cmd.setString(5, med.getSenha());
            
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
     public boolean AtualizarMedico(Medico med) throws SQLException {
        try {
            String sql = "UPDATE cadmedico SET  nome=?, datanasc=?, especialidade=?,senha=? WHERE ID_Medico=?;";

            cmd = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            cmd.setString(1, med.getNome());
            cmd.setString(2, med.getDatanasc());
            cmd.setString(3, med.getEspecialidade());
            cmd.setString(4, med.getSenha());
            cmd.setInt(5, med.getID_Medico());
            
        
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
     public ArrayList<Medico> listarMedico() {
        try {
            String sql = "SELECT * FROM cadmedico ORDER BY 1  ";
            cmd = con.prepareStatement(sql);
            ResultSet rs = cmd.executeQuery();
            ArrayList<Medico> listaMedico = new ArrayList<>();
            while (rs.next()) {
                Medico med = new Medico();
                med.setID_Medico(rs.getInt("ID_Medico"));
                med.setNome(rs.getString("nome"));
                med.setDatanasc(rs.getString("datanasc"));
                med.setEspecialidade(rs.getString("especialidade"));
                med.setSenha(rs.getString("senha"));
                listaMedico.add(med);
            }
            return listaMedico;
        } catch (Exception e) {
            return null;
        } finally {
            Conexao.Desconectar(con);
        }
    }
    public ArrayList<Medico> listarMedico(int med) {
        try {
            String sql = "SELECT * FROM cadmedico WHERE ID_Medico = ? ORDER BY 1  ";
            cmd = con.prepareStatement(sql);
            cmd.setInt(5, med);
            ResultSet rs = cmd.executeQuery();
            ArrayList<Medico> listaMedico = new ArrayList<>();
            while (rs.next()) {
                Medico medi = new Medico();
                medi.setID_Medico(rs.getInt("ID_Medico"));
                medi.setNome(rs.getString("nome"));
                medi.setDatanasc(rs.getString("datanasc"));
                medi.setEspecialidade(rs.getString("especialidade"));
                medi.setSenha(rs.getString("senha"));
                listaMedico.add(medi);
            }
            return listaMedico;
        } catch (Exception e) {
            return null;
        } finally {
            Conexao.Desconectar(con);
        }
    }
    public boolean deletarMedico(Medico med) throws SQLException {
        try{
            String sql = "DELETE FROM cadmedico WHERE ID_Medico=?";
            
            cmd = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            cmd.setInt(1, med.getID_Medico());
            
            if(cmd.executeUpdate() > 0) {
            con.commit();
            return true;
        }   else {
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
