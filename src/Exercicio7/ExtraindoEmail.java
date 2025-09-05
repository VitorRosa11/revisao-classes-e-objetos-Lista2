
package Exercicio7;

public class ExtraindoEmail {
    
    public String extrairDominio (String email){
        int posicao = email.indexOf("@");
        if (posicao != -1 && posicao < email.length() -1){
            return email.substring(posicao + 1);
        }
        return "Email válido.";
    }
}
