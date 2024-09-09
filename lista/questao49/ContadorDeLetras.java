package lista.questao49;
import java.util.Map;
import java.util.TreeMap;

public class ContadorDeLetras {
    public static void main(String[] args) {
        String texto = "HELLO THERE";
        
        // Mapa para armazenar as ocorrências das letras, usando TreeMap para manter a ordem alfabética
        Map<Character, Integer> mapaDeLetras = new TreeMap<>();
        
        // Convertendo a string para letras maiúsculas e removendo espaços
        texto = texto.replaceAll("\\s+", "").toUpperCase();
        
        // Percorrendo cada caractere da string
        for (char letra : texto.toCharArray()) {
            // Verifica se a letra já está no mapa
            if (mapaDeLetras.containsKey(letra)) {
                // Incrementa o valor da contagem da letra
                mapaDeLetras.put(letra, mapaDeLetras.get(letra) + 1);
            } else {
                // Adiciona a letra ao mapa com contagem inicial 1
                mapaDeLetras.put(letra, 1);
            }
        }

        // Exibe o resultado em ordem alfabética
        for (Map.Entry<Character, Integer> entrada : mapaDeLetras.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
    }
}
