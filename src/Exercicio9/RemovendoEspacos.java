package Exercicio9;

public class RemovendoEspacos {
    
    public String removerEspaco (String frase){
        return frase.trim().replaceAll("\\s+", " ");
    }
}
