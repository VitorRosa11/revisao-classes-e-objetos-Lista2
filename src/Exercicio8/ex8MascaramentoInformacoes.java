
package Exercicio8;

import java.util.Scanner;

public class ex8MascaramentoInformacoes {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        MascarandoInformacoes mascarar = new MascarandoInformacoes();
        
        System.out.println("N�mero do cart�o: ");
        String numeroCartao = entrada.nextLine();
        
        System.out.println("Cart�o mascarado: " + mascarar.mascararCartao(numeroCartao));
        
        entrada.close();
    }
}
