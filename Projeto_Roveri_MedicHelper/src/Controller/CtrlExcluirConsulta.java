/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Consulta;
import Model.ConsultaDAO;
import java.sql.SQLException;

//*
 // @author Gustavo Canova 

public class CtrlExcluirConsulta {

  public String expcalendar (Consulta exccalpac) throws SQLException, Exception {
        ConsultaDAO del = new ConsultaDAO();
       if (del.deletar(exccalpac)) {
            return "Consulta excluída com Sucesso";
        }           
          return "Erro ao excluir Consulta";
       }
    }  