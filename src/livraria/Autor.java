
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
        return "Nome : " + getNome()
                + "\n| DataDeNascimento : " + getDataDeNascimento();
    }

}//fim da class Autor
