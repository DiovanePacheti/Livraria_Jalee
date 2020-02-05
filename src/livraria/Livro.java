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
    private final Autor[] autores;

    //== Construtor ==
    public Livro(String titulo, String ISBN) {
        this.setTitulo(titulo);
        this.setISBN(ISBN);
        capitulos = new Capitulo[100];
        autores = new Autor[6];
    }

    public Capitulo[] getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(Capitulo[] capitulos) {
        this.capitulos = capitulos;
    }

    public Autor[] getAutores() {
          /*
        for(int i = 0 ; i < autores.length; i++){
            
        }
        return autores;*/
          for(Autor a : autores){
             
          }
          return autores;
    }

    public void setAutores(Autor autor) {
        System.out.println("Entrando no setAutores metodo da class Livro");
        for (int i = 0; i < autores.length; i++) {
            if (autores[i] == null) {
                System.out.println(autor.getNome());
                autores[i] = autor;
                break;
            }
            System.out.println("fora do if que verifica se o array de autores esta vazio ");
        }
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

    public int adicionarCapitulo(String titulo, String texto) {
        for (int i = 0; i < capitulos.length; i++) {

            if (capitulos[i] == null) { //se capitulos na posiçao i for igual a null 
                capitulos[i].setTitulo(titulo); //setando o titulo no caputilo na posição i
                capitulos[i].setTexto(texto);// setando o texto 
                break;
            }
            return i;
        }
        return -1;
    }//fim do method adicionar capitulo

    public int removerCapitulo(Capitulo capitulo) {
        for (int i = 0; i < capitulos.length; i++) {
            if(capitulos[i].equals(capitulo)){
                capitulos[i] = null;
            }//fim do if
            return i;
        }
        return -1;
    }//fim do method remover capitulo

    public int adicionarAutor(Autor autor) {
        for (int i = 0; i < autores.length; i++) {
            if (autores[i] == null) {
                
                autores[i] = autor;
                break;

            }
            return i;
        }
        return -1;
    }

    public int removerAutor(Autor autor) {
        for (int i = 0; i < autores.length; i++) {
            if(autores[i].equals(autor)){
                autores[i] = null;
            }
            return i;
        }
        return -1;
    }

    @Override
    public String toString() {
        String s = " ";
        s += "Livro";
        s += "\nTitulo = " + this.getTitulo();
        s += "\nISBN = " + this.getISBN();
        s += "\nCapitulos = ";//+ this.getCapitulos();
        for (Autor aut : autores) {
            s += aut.toString() + "\n";
        }

        //  s += "\nAutores = " + this.getAutores();
        return s;
    }

}// fim da class Livro
