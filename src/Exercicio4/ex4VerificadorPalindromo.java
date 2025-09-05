
package Exercicio4;

import java.util.Scanner;

public class ex4VerificadorPalindromo {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        VerificandoPalindromo verificador = new VerificandoPalindromo();
        
        System.out.println("Digite uma palavra: ");
        String palavra = entrada.nextLine();
        
        if (verificador.ehPalindromo(palavra)){
            System.out.println(palavra + " é um palíndromo.");
        } else {
            System.out.println(palavra + " não é um palíndromo.");
        }
    }
}
