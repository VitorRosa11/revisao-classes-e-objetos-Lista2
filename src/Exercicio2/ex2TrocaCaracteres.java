
package Exercicio2;

import java.util.Scanner;

public class ex2TrocaCaracteres {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        SubstituicaoCaracteres substituir =  new SubstituicaoCaracteres();
        
        System.out.println("Escreva uma frase: ");
        String frase = entrada.nextLine();
        
        System.out.println("Frase modificada para " + substituir.substituir(frase));
        
        entrada.close();
    }
}
