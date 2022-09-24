/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor02;

import java.time.LocalDate;

/**
 *
 * @author ferna
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mes[] = {"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out","Nov","Dez"};
        int tot[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        
        LocalDate dt = LocalDate.now();
        int anoAtual = dt.getYear();    //grava o ano atual
        
        if(anoAtual % 4 == 0 && anoAtual % 100 != 0){ //testa se o ano atual é bisexto
            tot[1] = 29;                             //mês de fevereiro tem 29 dias
        }
        
        for(int i = 0; i<mes.length; i++){
            System.out.println("O mês de " + mes[i] +" tem " + tot[i] + " dias ao todo.");
        }
    }
    
} 
