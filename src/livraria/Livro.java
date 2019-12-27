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
    private Capitulo[] capitulos;
    private Autor[] autores;
    //== Construtor ==
    public Livro(String titulo, String ISBN){
        this.setTitulo(titulo);
        this.setISBN(ISBN);
        capitulos = new Capitulo[100];
        autores = new Autor[100];
    }

    public Capitulo[] getCapitulos() {
        return capitulos;
    }

    public  void setCapitulos(Capitulo[] capitulos) {
        this.capitulos = capitulos;
    }

    public Autor[] getAutores() {
        return autores;
    }

    public void setAutores(Autor[] autores) {
        this.autores = autores;
    }

    
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
    
    public int adicionarCapitulo(String titulo, String texto){
    
        return 0;
    }//fim do method adicionar capitulo
    
    public int removerCapitulo(Capitulo capitulo){
        
        return 0;
    }//fim do method remover capitulo
    
    public int adicionarAutor(Autor autor){
        for(int i = 0; i < autores.length; i++){
            if(autores[i] == null){
                autores[i] = autor;
                return i;
            }
        }
        return -1;
    }
    public int removerAutor(Autor autor){
    
        return 0;    
    }

    @Override
    public String toString() {
        return "Livro{" + "titulo=" + titulo + ", ISBN=" + ISBN + ", capitulos=" + capitulos + ", autores=" + autores + '}';
    }
    
    
}// fim da class Livro
