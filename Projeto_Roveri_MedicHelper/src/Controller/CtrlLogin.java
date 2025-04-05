/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Paciente;
import Model.LoginDAO;
import Model.Medico;
import Model.Administrador;
import java.sql.SQLException;

/**
 *
 * @author Gustavo Canova
 */
public class CtrlLogin {

    public CtrlLogin() {

    }

    public boolean validaLoginPaciente(Paciente log) throws SQLException {

        LoginDAO validarpac = new LoginDAO();
        if (validarpac.login(log)){
            return true;
        } else {
            return false;

        }
    }
    public boolean validaLoginMedico(Medico log) throws SQLException {
        
        LoginDAO validarmed = new LoginDAO();
        if (validarmed.loginMedico(log)) {
            return true;
        } else {
            return false;

     }
   
    }
    public boolean validaLoginAdministrador(Administrador log) throws SQLException {
        
        LoginDAO validaradm = new LoginDAO();
        if (validaradm.loginAdministrador(log)){
            return true;
        } else {
            return false;

     }
   
    }
}

