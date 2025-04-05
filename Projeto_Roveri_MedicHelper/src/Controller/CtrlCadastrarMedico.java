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
public class CtrlCadastrarMedico {
    public CtrlCadastrarMedico() {

    }

    public String CadastroMedico(Medico med) throws SQLException {
        MedicoDAO cad = new MedicoDAO();
        if (cad.inserir(med)){
            return "Medico cadastrado com Sucesso";
        } else {
            return "Erro ao cadastrar Medico";
        }
    }

   
}
