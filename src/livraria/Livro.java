
package livraria;


/**
 *
 * @author dio-end
 * 
 * Desenvolver uma classe Livro, que possui 
 * um título, um ISBN, vários capítulos e um 
 * ou vários autores. O construtor deve obrigar 
 * o preenchimento do título e do ISBN do livro. 
 * Esta classe deve possuir alguns métodos além 
 * dos métodos tradicionais, e são eles: 
 */
public class Livro {

    // == Atributos ==
    private String titulo = "";
    private String ISBN = "";
    private Capitulo[] capitulos;
    private Autor[] autores;

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

    public void setCapitulos(Capitulo capitulo) {
        for (int i = 0; i < capitulos.length; i++) {
            if (capitulos[i] == null) {

                capitulos[i] = capitulo;

                break;
            }
        }


    }

    public Autor[] getAutores() {

        for(Autor a : autores){

        }
        return autores;
    }

    public void setAutores(Autor autor) {
        for (int i = 0; i < autores.length; i++) {
            if (autores[i] == null) {
                autores[i] = autor;
                break;
            }
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
    /**
     * adicionarCapitulo - que receberá por parâmetro o título e o texto
     * do capítulo, e retornar um inteiro com a posição do array de 
     * capítulos onde o capítulo foi inserido, ou -1, caso não tenha sido 
     * possível inserir. Considere que um livro possui no máximo 100 capítulos.
     * 
     * @param titulo
     * @param texto
     * @return 
     */
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
    
    /** 
     * removerCapitulo - que recebe por parâmetro um Capítulo, e remove o
     * mesmo do array de capítulos. Retornando a posição do array onde 
     * estava o Capítulo ou -1 caso o capítulo não for encontrado.
     * @param capitulo
     * @return 
     */
    public int removerCapitulo(Capitulo capitulo) {
        for (int i = 0; i < capitulos.length; i++) {
            if(capitulos[i].equals(capitulo)){
                capitulos[i] = null;
            }//fim do if
            return i;
        }
        return -1;
    }//fim do method remover capitulo
    
    /**
     * adicionarAutor - recebe por parâmetro 
     * um Autor e o adiciona no array de autores, 
     * retornando a posição do array onde o autor 
     * foi inserido ou -1 caso não tenha sido 
     * possível inseri-lo. Considere que um 
     * livro possa possuir no máximo 6 autores.
     * @param autor
     * @return 
     */
    public int adicionarAutor(Autor autor) {
        for (int i = 0; i < autores.length; i++) {
            if (autores[i] == null) {
                setAutores(autor);
                autores[i] = autor;
                break;

            }
            return i;
        }
        return -1;
    }
    /**
     * removerAutor - que recebe por parâmetro 
     * um Autor e o remove do 	array de autores, 
     * retornando a posição onde estava o autor ou -1 	
     * caso não tenha sido possível remover.
     * @param autor
     * @return 
     */
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
        s += "\n| Titulo = " + this.getTitulo();
        s += "\n| ISBN = " + this.getISBN();
        s += "\n+-------------- Autor(s) \n";
        for (int i = 0; i < autores.length; i++) {
            if (autores[i] != null) {
                s +="| " + autores[i].toString() + "\n";
            }//fim do if
        }//fim do for
        s += "+------------- Capitulos ";
        for (int i = 0; i < capitulos.length; i++) {
            if (capitulos[i] != null) {
                s += capitulos[i].toString() + "\n";
            }//fim do if
        }//fim do for
        return s;
    }

}// fim da class Livro
