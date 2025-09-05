
package Exercicio1;

import java.util.Scanner;

public class ex1ContagemLetras {
    
    public static void main(String[] args) {
        
       Scanner entrada = new Scanner(System.in);
       
       ContadorLetras contador = new ContadorLetras();
        System.out.println("Escreva uma palavra: ");
        String palavra = entrada.nextLine();
        
        System.out.println(palavra + " tem " + contador.contarLetras(palavra)+ " letras.");
    }
}
