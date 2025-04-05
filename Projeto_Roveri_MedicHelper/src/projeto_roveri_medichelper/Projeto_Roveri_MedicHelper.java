/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_roveri_medichelper;

import java.sql.Connection;
import Connection.Conexao;
/**
 *
 * @author Gustavo Canova
 */

import View.FrmLogin;
import javax.swing.SwingConstants;

public class Projeto_Roveri_MedicHelper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Connection con = Conexao.Conectar();
        if (Conexao.Conectar()!= null) {
            System.out.println("Connection ok");
        
            FrmLogin log = new FrmLogin();
            log.setVisible(true);
        
       /* int i;
    
    for(i= 1950;i<=2080;i++){
        System.out.println(""+i);       
    /**/
    }
    
    
    }
}

