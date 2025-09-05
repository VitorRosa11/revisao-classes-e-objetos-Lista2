
package Exercicio3;

import java.util.Scanner;

public class ex3InverterPalavras {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
       InvertendoPalavras inversor = new InvertendoPalavras();
       
        System.out.println("Escreva uma palavra: ");
        String palavra = entrada.nextLine();
        
        System.out.println(inversor.inverter(palavra));
        entrada.close();
    }
}
