
package Exercicio9;

import java.util.Scanner;

public class ex9RemocaoEspacoExtra {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        RemovendoEspacos remover = new RemovendoEspacos();
        
        System.out.println("Digite uma frase: ");
        String frase = entrada.nextLine();
        
        System.out.println("Frase reestruturada: " + remover.removerEspaco(frase));
        entrada.close();
    }
}
