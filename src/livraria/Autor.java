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
    private LocalDate dataDeNascimento;
    
    public Autor(String nome){
        this.setNome(nome);
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    
    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Autor{" + "nome=" + nome + ", dataDeNascimento=" + dataDeNascimento + '}';
    }
   
    
}//fim da class Autor
