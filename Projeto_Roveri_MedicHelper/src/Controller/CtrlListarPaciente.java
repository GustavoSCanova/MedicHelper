/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.SQLException;
import java.util.ArrayList;
import Model.Paciente;
import Model.PacienteDAO;
import java.sql.SQLException;

/**
 *
 * @author Gustavo Canova
 */
public class CtrlListarPaciente {


 public ArrayList<Paciente> listar() {
        try {
            PacienteDAO pac = new PacienteDAO();
            return pac.listar();
        } catch (Exception ex) {
            
            return null;
        }
    }
}