
package Exercicio7;

import java.util.Scanner;

public class ex7ExtracaoEmail {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        ExtraindoEmail extrator = new ExtraindoEmail();
        
        System.out.println("Email: ");
        String email = entrada.nextLine();
        
        System.out.println("Domínio: " + extrator.extrairDominio(email));
        entrada.close();
        
    }
}
