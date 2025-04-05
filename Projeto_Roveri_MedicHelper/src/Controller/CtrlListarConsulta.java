/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Consulta;
import Model.ConsultaDAO;
import java.util.ArrayList;


/**
 *
 * @author Gustavo Canova
 */
public class CtrlListarConsulta {
    
     public ArrayList<Consulta> calendarios() {
        try {
            ConsultaDAO listarconsultas = new ConsultaDAO();
            return listarconsultas.listarcons();
        } catch (Exception ex) {
            
        }
            return null;
        
     }
     public ArrayList<Consulta> lista() {
        try {
            ConsultaDAO listarconsultas = new ConsultaDAO();
            return listarconsultas.listarcons1();
        } catch (Exception ex) {
            
        }
            return null;
        
     }
}
