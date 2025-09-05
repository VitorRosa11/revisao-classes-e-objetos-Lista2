
package Exercicio5;

import java.util.Scanner;

public class ex5ContagemPalavras {
 
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        ContandoPalavras contador = new ContandoPalavras();
        
        System.out.println("Digite uma frase: ");
        String frase = entrada.nextLine();
        
        System.out.println("Sua frase tem " + contador.contarPalavras(frase) + " palavras.");
        
    }
}
