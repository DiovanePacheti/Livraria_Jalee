/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livraria;
import java.time.LocalDate;
import java.util.Scanner;
import utilitario.Util;

/**
 *
 * @author dio-end
 */
public class Livraria {
    
    Scanner scan = new Scanner(System.in);  
    Util util = new Util();
    Livro[] livros = new Livro[500];
    public Livraria() throws InterruptedException{
    menu();
    }//construtor da class
    
    
    private void menu() throws InterruptedException{
        int escolha = 0;
        do{
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
            escolha = scan.nextInt();
            try{
               // escolha = Util.leInteiro("Escolha uma opção: ");
               switch(escolha){
                   case 1:
                       cadastrarLivro();
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
            } catch (Exception ex){//fim do try
                System.err.println(ex.getMessage());
                Thread.sleep(1000);
            }
            
        }while(escolha != 9);
        
        
    }//fim do method menu
    
    private int cadastrarLivro(){
        do{
            String titulo = util.leString("digite o titulo do livro : ");
            String isbn = util.leString("Digite o ISBN : ");
            /*instanciando um objeto livro para receber nosso argumentos 
            e criar um novo livro na livraria */
            Livro novoLivro = new Livro(titulo,isbn);
            /*varrendo o array para encontrar uma posiçao livre para cadastrar*/
            for(int i=0; i < livros.length; i++){
                if(livros[i] == null){
                    this.livros[i] = novoLivro;
                    //System.out.println(livros[i].toString());
                      //System.out.println(novoLivro.getTitulo());
                      int numAutores = util.leInteiro("Digite o numero de autores a cadastrar :");
                        /*chamando o method cadastraAutores passando o livro que foi criado
                        como argumento e a quantidade de autores o livro possui*/
                        cadastraAutores(livros[i],numAutores);
                    break;
                }//fim do if
                return i;
            }//fim do for 
            return -1;
        }while(true);
    }//fim do method cadastrarLivro
    
    private void cadastraAutores(Livro livro,int numeroDeAutores){
            for(int i =0; i < livros.length; i++){
                
                if(livros[i].equals(livro)){
                    String nome; 
                    nome = util.leString("Digite nome do autor : ");
                    Autor novoAutor = new Autor(nome);
                    System.out.println("Digite a data de Nascimento do autor : ");
                    do{
                        String data = scan.next(); //formato esperado da data 00/00/0000
                        String[] partes = data.split("/"); //definindo o simbolo separador
                        int dia = Integer.parseInt(partes[0]);
                        int mes = Integer.parseInt(partes[1]);
                        int ano = Integer.parseInt(partes[2]);
                        if((dia<31)&&(mes<12)){
                            novoAutor.setDataDeNascimento(LocalDate.of(ano,mes,dia));
                            break;
                        }
                    }while(true);

                    livros[i].adicionarAutor(novoAutor);
                    System.out.println("=========== livro  =================:\n " + livros[i].toString());
                }//fim do if    
           }//fim do for
    }//fim do metodo cadastra Autores
    
    private void cadastraCapitulos(Livro livro,int numeroDeCapitulos){
        
    }//fim do method cadastra Capitulos
    
    private void adicionarAutorLivro(Livro livro){
        
    }//fim do method adicionar Autor Livro
    private void adicionarCapituloLivro(Livro livro){
        
    }//fim do method adicionar capitulo livro
    
    private void removerLivro(){
        
    }//fim do metodo remover livro
    
    private void listarCapitulos(Livro livro){
        Capitulo[] capitulos = livro.getCapitulos();
        for(int i = 0; i < capitulos.length; i++){
            if(capitulos[i] != null){
                  System.out.printf("Capitulo %d - %s\n",i+1,capitulos[i]);
            }//fim do if
        }//fim do for
    }
    
    private void listarCapitulos(){
 
       listarAcervo();
       int idDoLivro = util.leInteiro("Digite id do livro que deseja ver os capitulos: ");
       listarCapitulos(livros[idDoLivro]);
    }//fim do method listar capitulos
    
    private void listarAcervo(){
        for (int i = 0; i < livros.length; i++) {
            if(livros[i] != null){
                System.out.printf("[%d] %s",i, livros[i] +"\n");
            }//fim do if
        }//fim do for
 
    }// fim do method listar acervo
    
    private void resetarLivraria(){
        
    }// fim do method resetar livraria 
    
    private void modificarLivroDoAcervo(){
        
    }// fim do method modificar livro do acervo
    
   
    
}//fim da class
