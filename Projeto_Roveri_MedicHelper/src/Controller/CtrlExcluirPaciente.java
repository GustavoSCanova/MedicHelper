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
public class CtrlExcluirPaciente {

    public String expaciente(Paciente pac) throws SQLException {
        PacienteDAO del = new PacienteDAO();
        if (del.deletar(pac)) {
            return "Paciente excluído com Sucesso";
        }           
          return "Erro ao excluir Paciente";
       }
    }


