
package Exercicio8;

public class MascarandoInformacoes {
    
    public String mascararCartao (String numeroCartao){
        if(numeroCartao.length() <= 4){
            return numeroCartao;
        }
        int tamanho = numeroCartao.length();
        String ultimos4 = numeroCartao.substring(tamanho - 4);
        return "*".repeat(tamanho - 4) + ultimos4;
    }
}
