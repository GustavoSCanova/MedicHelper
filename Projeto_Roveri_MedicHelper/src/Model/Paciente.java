/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.Date;
import java.util.ArrayList;

/**
 *
 * @author Gustavo Canova
 */
public class Paciente {

    private int ID_Paciente;
    private String nome;
    private String datanasc;
    private String rg;
    private String cpf;
    private String senha;
    private int idSalvo;

    public Paciente() {
    }

    public Paciente(int pi, String pn, String pd, String pr, String pc, String ps) {

        this.ID_Paciente = pi;
        this.nome = pn;
        this.datanasc = pd;
        this.rg = pr;
        this.cpf = pc;
        this.senha = ps;
    }

    public int getID_Paciente() {
        return ID_Paciente;
    }

    public void setID_Paciente(int ID_Paciente) {
        this.ID_Paciente = ID_Paciente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(String datanasc) {
        this.datanasc = datanasc;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getIdSalvo() {
        return idSalvo;
    }

    public void setIdSalvo(int idSalvo) {
        this.idSalvo = idSalvo;
    }

  
}
 
