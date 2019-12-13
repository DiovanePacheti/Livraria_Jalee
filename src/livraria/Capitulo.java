/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livraria;

import java.util.Objects;

/**
 *
 * @author dio-end
 */
public class Capitulo {
    
    private String titulo = "";
    private String texto = "";
    
    public Capitulo(){ /* construtor vazio*/}
    
    public Capitulo(String titulo,String texto){
        this.setTexto(texto);
        this.setTitulo(titulo);
    }//fim do construtor

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.titulo);
        hash = 11 * hash + Objects.hashCode(this.texto);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Capitulo other = (Capitulo) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.texto, other.texto)) {
            return false;
        }
        return true;
    }

    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "---------- Capitulo -----------\n" + 
                "Titulo :" + this.getTitulo() + 
                "Texto :" + this.getTexto()  ;
    }
    
    
    
}//fim da class Capitulo
