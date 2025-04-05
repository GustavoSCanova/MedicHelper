/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.SQLException;
import Model.Paciente;
import Model.PacienteDAO;

/**
 *
 * @author Gustavo Canova
 */
public class CtrlAtualizarPaciente {

    public CtrlAtualizarPaciente(){
        
    }
    public String atuPaciente(Paciente pac) throws SQLException {
        PacienteDAO att = new PacienteDAO() ;
    if (att.atualizar(pac)){
            return "Paciente atualizado com Sucesso";            
        }
        else {
            return "Erro ao atualizar paciente";
        }
     }
}
    
    
    

