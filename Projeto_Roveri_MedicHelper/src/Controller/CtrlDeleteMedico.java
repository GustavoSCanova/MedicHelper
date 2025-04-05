/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Medico;
import Model.MedicoDAO;
import java.sql.SQLException;

/**
 *
 * @author aluno
 */
public class CtrlDeleteMedico {
    public CtrlDeleteMedico(){
        
    }
    public String excluirMedico(Medico med) throws SQLException {
        MedicoDAO delete = new MedicoDAO();
        if (delete.deletarMedico(med)){
            return "Medico excluido com sucesso";
        } else {
            return "Não foi possivel excluir medico";
        }
    }
}
