
package Exercicio5;

public class ContandoPalavras {
    
    public int contarPalavras (String frase){
        String[] palavras = frase.trim().split("\\s+");
        return palavras.length;
    }
}
