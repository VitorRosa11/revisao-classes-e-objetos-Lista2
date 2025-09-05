package Exercicio10;

public class ContandoVogaisEConsoantes {
    
    public void contar (String palavra){
        int vogais = 0, consoantes = 0;
         palavra = palavra.toLowerCase();

        for (char c : palavra.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) != -1) {
                    vogais++;
                } else {
                    consoantes++;
                }
            }
        }

        System.out.println("Vogais: " + vogais);
        System.out.println("Consoantes: " + consoantes);
    }
    
}
