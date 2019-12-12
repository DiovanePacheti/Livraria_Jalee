/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livraria;

/**
 *
 * @author dio-end
 */
public class Livro {
    // == Atributos ==
    private String titulo = "";
    private String ISBN = "";
    
    //== Construtor ==
    public Livro(String titulo, String ISBN){
        
    }

    //== Methodos acessores ==
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    
}// fim da class Livro
