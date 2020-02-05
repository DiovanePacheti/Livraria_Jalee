
package livraria;


import java.time.LocalDate;

/**
 *
 * @author dio-end
 * 
 * Desenvolver uma classe Autor. que possui 
 * um nome e data de nascimento (do tipo LocalDate). 
 * O construtor deve forçar o 	preenchimento do nome 
 * do Autor. As regras de encapsulamento e boas 
 * práticas devem ser aplicadas para todas as 
 * classes deste projeto.
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
        return "Nome : " + getNome()
                + "\n| DataDeNascimento : " + getDataDeNascimento();
    }

}//fim da class Autor
