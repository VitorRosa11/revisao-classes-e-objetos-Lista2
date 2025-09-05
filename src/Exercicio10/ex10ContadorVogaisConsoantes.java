package Exercicio10;

import Exercicio1.ContadorLetras;
import java.util.Scanner;

public class ex10ContadorVogaisConsoantes {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        ContandoVogaisEConsoantes contador = new ContandoVogaisEConsoantes();
        
         System.out.print("Digite uma palavra: ");
        String palavra = entrada.nextLine();
        
        contador.contar(palavra);
        entrada.close();

    }
}
