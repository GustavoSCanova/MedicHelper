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
public class CtrlCadastrarPaciente {

    public CtrlCadastrarPaciente() {

    }

    public String cadpaciente(Paciente pac) throws SQLException {
        PacienteDAO cad = new PacienteDAO();
        if (cad.inserir(pac)){
            return "Paciente cadastrado com Sucesso";
        } else {
            return "Erro ao cadastrar Paciente";
        }
    }

}
