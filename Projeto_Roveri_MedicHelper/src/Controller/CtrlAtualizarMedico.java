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
 * @author mahs
 */
public class CtrlAtualizarMedico {
    public CtrlAtualizarMedico(){
    
}
    public String atuMedico(Medico med) throws SQLException {
        MedicoDAO atuMedico = new MedicoDAO() ;
    if (atuMedico.AtualizarMedico(med)){
            return "Medico atualizado com Sucesso";            
        }
        else {
            return "Erro ao atualizar Medico";
        }
     }
}
