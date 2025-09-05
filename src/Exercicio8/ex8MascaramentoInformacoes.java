
package Exercicio8;

import java.util.Scanner;

public class ex8MascaramentoInformacoes {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        MascarandoInformacoes mascarar = new MascarandoInformacoes();
        
        System.out.println("Número do cartão: ");
        String numeroCartao = entrada.nextLine();
        
        System.out.println("Cartão mascarado: " + mascarar.mascararCartao(numeroCartao));
        
        entrada.close();
    }
}
