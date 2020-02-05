
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
                setAutores(autor);
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
