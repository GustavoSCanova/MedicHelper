/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.Medico;
import Model.MedicoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author mahs
 */
public class CtrlListarMedico {
    public ArrayList<Medico> listar() {
        try {
            MedicoDAO medd = new MedicoDAO();
            return medd.listarMedico();
        } catch (SQLException ex) {
            
            return null;
        }
    }
}
