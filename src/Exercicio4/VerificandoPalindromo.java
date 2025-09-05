
package Exercicio4;

public class VerificandoPalindromo {
    
    public boolean ehPalindromo (String palavra){
        String ViceVersa = new StringBuilder(palavra).reverse().toString();
        return palavra.equalsIgnoreCase(ViceVersa);
    }
}
