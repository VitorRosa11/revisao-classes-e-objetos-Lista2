
package Exercicio6;

import java.util.Scanner;

public class ex6CapitalizacaoNomes {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        CapturandoNomes capitalizador = new CapturandoNomes();
        
        System.out.println("Nome completo: ");
        String NomeCompleto = entrada.nextLine();
        
        System.out.println("Nome formatado: " + capitalizador.capitalizar(NomeCompleto));
        
        entrada.close();
    }
}
