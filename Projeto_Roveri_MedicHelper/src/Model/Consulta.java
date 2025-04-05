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
public class Consulta {
    
private String ID_Consulta;	
private String ID_Medico;	
private String ID_Paciente;	
private String dataconsulta;

public Consulta(){
    
}

public Consulta(String PIDC , String PIDM , String PIDP ,String PDAT){
this.ID_Consulta = PIDC;
this.ID_Medico = PIDM;
this.ID_Paciente = PIDP;
this.dataconsulta = PDAT;
   
}   

    public String getID_Consulta() {
        return ID_Consulta;
    }

    public void setID_Consulta(String ID_Consulta) {
        this.ID_Consulta = ID_Consulta;
    }

    public String getID_Medico() {
        return ID_Medico;
    }

    public void setID_Medico(String ID_Medico) {
        this.ID_Medico = ID_Medico;
    }

    public String getID_Paciente() {
        return ID_Paciente;
    }

    public void setID_Paciente(String ID_Paciente) {
        this.ID_Paciente = ID_Paciente;
    }

    public String getDataconsulta() {
        return dataconsulta;
    }

    public void setDataconsulta(String dataconsulta) {
        this.dataconsulta = dataconsulta;
    }

}
