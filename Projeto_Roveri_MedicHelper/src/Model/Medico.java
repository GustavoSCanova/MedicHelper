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
public class Medico {
    
   private int ID_Medico;
   private String nome;
   private String datanasc;
   private String especialidade;
   private String senha;
   
public  Medico() {

}
    public Medico(int id , String nome, String datanasc, String especialidade, String senha){
    this.ID_Medico = id;
    this.nome = nome;
    this.datanasc = datanasc;
    this.especialidade = especialidade;
    this.senha = senha;
}

    public int getID_Medico() {
        return ID_Medico;
    }

    public void setID_Medico(int ID_Medico) {
        this.ID_Medico = ID_Medico;
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

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
