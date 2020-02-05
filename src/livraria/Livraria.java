
package livraria;

import java.time.LocalDate;
import java.util.Scanner;
import utilitario.Util;


/**
 * @author dio-end
 */
public class Livraria {

    Scanner scan = new Scanner(System.in);
    Util util = new Util();
    Livro[] livros = new Livro[500];

    public Livraria() throws InterruptedException {

        menu();

    }//construtor da class


    private void menu() throws InterruptedException {
        int escolha;
        do {
            System.out.println("+================================+");
            System.out.println("|        Livraria Jalee          |");
            System.out.println("+--------------------------------+");
            System.out.println("| 1 - Cadastrar novo livro       |");
            System.out.println("| 2 - Remover livro do acervo    |");
            System.out.println("| 3 - Listar acervo              |");
            System.out.println("| 4 - Resetar livraria           |");
            System.out.println("| 5 - Modificar Livro do Acervo  |");
            System.out.println("| 6 - Listar capitulos de livro  |");
            System.out.println("| 9 - Sair                       |");
            System.out.println("+--------------------------------+");
            escolha = util.leInteiro("Escolha uma opção: ");
            try {

                switch (escolha) {
                    case 1:
                        int resultado = cadastrarLivro();

                        if (resultado != -1) {
                            System.out.println("Livro inserido na posição " + resultado);
                        } else {
                            System.err.println("nao foi possivel cadastrar o livro " + resultado);
                        }
                        break;
                    case 2:
                        removerLivro();
                        break;
                    case 3:
                        listarAcervo();
                        break;
                    case 4:
                        resetarLivraria();
                        break;
                    case 5:
                        modificarLivroDoAcervo();
                        break;
                    case 6:
                        listarCapitulos();
                        break;
                    case 9:
                        break;

                    default:
                        System.err.println("Opção inválida!");
                }//fim switch case
            } catch (Exception ex) {//fim do try
                System.err.println(ex.getMessage());
                Thread.sleep(1000);
            }

        } while (escolha != 9);


    }//fim do method menu

    private int cadastrarLivro() {
        int retornandoNumeroPosicao = -1;
        String titulo = util.leString("digite o titulo do livro : ");
        String isbn = util.leString("Digite o ISBN : ");
            /*instanciando um objeto livro para receber nosso argumentos
            e criar um novo livro na livraria */
        Livro novoLivro = new Livro(titulo, isbn);
        /*varrendo o array para encontrar uma posiçao livre para cadastrar*/

        for (int i = 0; i < livros.length; i++) {

            if (livros[i] == null) {

                this.livros[i] = novoLivro;
                retornandoNumeroPosicao = i;
                int numAutores = util.leInteiro("Digite o numero de autores a cadastrar :");
                        /*chamando o method cadastraAutores passando o livro que foi criado
                        como argumento e a quantidade de autores o livro possui*/
                cadastraAutores(novoLivro, numAutores);

                int numCapitulos = util.leInteiro("deseja cadastar quantos capitulos : ");
                cadastraCapitulos(novoLivro, numCapitulos);

                break;
            }//fim do if

        }//fim do for
        if (retornandoNumeroPosicao != -1) {
            return retornandoNumeroPosicao;
        }
        return -1;
    }//fim do method cadastrarLivro ==========================================================================

    private void cadastraAutores(Livro livro, int numeroDeAutores) {
        String nome;
        for (int i = 0; i < livros.length; i++) {
            if (livros[i].equals(livro)) {
                for (int j = 0; j < numeroDeAutores; j++) {
                    nome = util.leString("Digite nome do autor : ");
                    Autor novoAutor = new Autor(nome);
                    System.out.println("Digite a data de Nascimento do autor : ");
                    do {
                        String data = scan.next(); //formato esperado da data 00/00/0000
                        String[] partes = data.split("/"); //definindo o simbolo separador
                        int dia = Integer.parseInt(partes[0]);
                        int mes = Integer.parseInt(partes[1]);
                        int ano = Integer.parseInt(partes[2]);
                        if ((dia < 31) && (mes < 12)) {
                            novoAutor.setDataDeNascimento(LocalDate.of(ano, mes, dia));
                            break;
                        }
                    } while (true);
                    livros[i].setAutores(novoAutor); //adicionarAutor(novoAutor);
                }//fim do for que repeteo numero de vez que vai se add autores
                break;
            }//fim do if
        }//fim do for

    }//fim do metodo cadastra Autores

    private void cadastraCapitulos(Livro livro, int numeroDeCapitulos) {
        for (int i = 0; i < livros.length; i++) {
            if (livros[i].equals(livro)) {
                for (int j = 0; j < numeroDeCapitulos; j++) {
                    System.out.println("Cadastro de Capitulos(" + j + "/" + numeroDeCapitulos + ")");
                    String tituloCapitulo = util.leString("Digite o titulo do capítulo : ");
                    String texto = util.leString("Digite o texto do capítulo : ");
                    Capitulo novoCapitulo = new Capitulo(tituloCapitulo, texto);
                    livros[i].setCapitulos(novoCapitulo);
                }//fim do for que repeti o numero de vez de capitulos a ser cadastrado
                break;
            }
        }
    }//fim do method cadastra Capitulos

    private void adicionarAutorLivro(Livro livro) {
        /*=============  adicionarAutorLivro ======*/
        for (int i = 0; i < livros.length; i++) {
            if (livros[i].equals(livro)) {
                String nome = util.leString("Você ira inserir un novo nome de um autor do livro " + livros[i].getTitulo() + " : ");
                Autor novoAutor = new Autor(nome);
                String data = util.leString("Digite a data de Nascimento do autor (00/00/0000) : "); //formato esperado da data 00/00/0000
                do {
                    String[] partes = data.split("/"); //definindo o simbolo separador
                    int dia = Integer.parseInt(partes[0]);
                    int mes = Integer.parseInt(partes[1]);
                    int ano = Integer.parseInt(partes[2]);
                    if ((dia < 31) && (mes < 12)) {
                        novoAutor.setDataDeNascimento(LocalDate.of(ano, mes, dia));
                        break;
                    }//fim do if
                } while (true);//fim do Do

                livros[i].setAutores(novoAutor);
                break;
            }
        }
    }//fim do method adicionar Autor Livro

    private void adicionarCapituloLivro(Livro livro) {
        /* ============= adicionarCapituloLivro =======*/
        for (int i = 0; i < livros.length; i++) {
            if (livros[i].equals(livro)) {
                String tituloCapitulo = util.leString("Digite o titulo do capítulo : ");
                String texto = util.leString("Digite o texto do capítulo : ");
                Capitulo novoCapitulo = new Capitulo(tituloCapitulo, texto);
                livros[i].setCapitulos(novoCapitulo);
                break;
            }
        }
    }//fim do method adicionar capitulo livro

    private void removerLivro() {
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] != null) {
                System.out.println(i + "º " + livros[i].getTitulo());
            }
        }
        int idLivro = util.leInteiro("Digite o indice do livro : ");
        String titulo = livros[idLivro].getTitulo();
        livros[idLivro] = null;
        System.out.println("o livro " + titulo + "foi removido !");

    }//fim do metodo remover livro

    private void listarCapitulos(Livro livro) {
        Capitulo[] capitulos = livro.getCapitulos();
        for (int i = 0; i < capitulos.length; i++) {
            if (capitulos[i] != null) {
                System.out.printf("Capitulo %d - %s\n", i + 1, capitulos[i]);
            }//fim do if
        }//fim do for
    }// fim do method listar

    private void listarCapitulos() {

        listarAcervo();
        int idDoLivro = util.leInteiro("Digite id do livro que deseja ver os capitulos: ");
        listarCapitulos(livros[idDoLivro]);
    }//fim do method listar capitulos

    private void listarAcervo() {
        System.out.println("+======== Acervo livraria Jalee ========+\n" +
                "|                                       |");
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] != null) {
                System.out.printf("+---------------------------------------+\n| %dº Livro  %s", i, livros[i].toString() + "\n");
            }//fim do if
        }//fim do for

    }// fim do method listar acervo

    private void resetarLivraria() {
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] != null) {
                System.out.println("deletando " + livros[i].getTitulo());
                livros[i] = null;
            } else {
                break;
            }
        }
    }// fim do method resetar livraria

    private void modificarLivroDoAcervo() {
        listarAcervo();
        int idLivro = util.leInteiro("Digite o id do livro : ");

        System.out.println();
        int opcao = util.leInteiro("+================================+ " +
                "\n|        Livraria Jalee          |" +
                "\n+--------------------------------+" +
                "\n| 1 - Inserir novo capítulo      |" +
                "\n| 2 - Inserir novo autor         |\n");

        switch (opcao) {
            case 1:

                adicionarCapituloLivro(livros[idLivro]);


                break;
            case 2:
                adicionarAutorLivro(livros[idLivro]);

                break;

            default:
                System.err.println("Opção inválida!");
        }
    }// fim do method modificar livro do acervo


}//fim da class