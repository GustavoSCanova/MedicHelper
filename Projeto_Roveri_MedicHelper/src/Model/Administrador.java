/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Gustavo Canova
 */
public class Administrador extends Paciente {
 
    private int ID_Adm;
    private String senha;
    
    
public  Administrador() {
}    
    
    
public Administrador(int pi , String ps){
this.ID_Adm = pi;
this.senha = ps;

}

    public int getID_Adm() {
        return ID_Adm;
    }

    public void setID_Adm(int ID_Adm) {
        this.ID_Adm = ID_Adm;
    }

   
}
