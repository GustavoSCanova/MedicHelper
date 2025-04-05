/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Consulta;
import Model.ConsultaDAO;
import Model.Consulta;
import java.sql.SQLException;


/**
 *
 * @author Gustavo Canova
 */
public class CtrlConsultaPaciente {



public CtrlConsultaPaciente(){

}

  public String ConsultaPac(Consulta conspaciente) throws SQLException, Exception {
        ConsultaDAO cad = new ConsultaDAO();
        if (cad.inserir(conspaciente)){
            return "Consulta Marcada com Sucesso";
        } else {
            return "Erro ao Realizar Consulta";
        }
    }
}



