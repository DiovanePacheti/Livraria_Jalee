/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livraria;

import java.time.LocalDate;

/**
 *
 * @author dio-end
 */
public class Autor {
    
    private String nome = "";
    
    
    public Autor(String nome){
        this.setNome(nome);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public LocalDate getDataDeNascimento(){
        
        return this.DataDeNascimento();
    }
}//fim da class Autor
