
package Exercicio6;

public class CapturandoNomes {
    public String capitalizar (String NomeCompleto){
        String[] partes = NomeCompleto.trim().split("\\s+");
        StringBuilder resultado = new StringBuilder();
        
         for (String parte : partes) {
            if (parte.length() > 0) {
                resultado.append(Character.toUpperCase(parte.charAt(0)))
                         .append(parte.substring(1).toLowerCase())
                         .append(" ");
            }
        }
        return resultado.toString().trim();
    
    }
    
}
