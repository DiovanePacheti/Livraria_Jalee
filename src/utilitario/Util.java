/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitario;

import java.time.LocalDate;
import java.util.Scanner;
/**
 *
 * @author dio-end
 */
public class Util {
    
    Scanner scan = new Scanner(System.in); 
    
    public int leInteiro(String mensagem){
        System.out.print(mensagem);
        return scan.nextInt();
    }//fim do method li inteiro
    
    public String leString(String mensagem){
        System.out.print(mensagem);
        return scan.next();
    }//fim do method le string
    
    
    /*public LocalDate leLocalDate(String mensagem){
        
        return ;
    }*/
    
}//fim da class Util
