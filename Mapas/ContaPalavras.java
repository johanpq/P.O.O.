package Mapas;

import java.util.TreeMap;

public class ContaPalavras {
    public static void main(String[] args) {
        // Conta quantas palavras aparecem
        String entrada = "Lorem sadkokqwkd Lorem dkao koqwdk qko qwko qkwo koqk oqwkoq qwkqo qk qoqk d";
        // TreeMap já insere ordenado
        TreeMap<String, Integer> contador = new TreeMap<>();

        String[] palavras = entrada.split(" ");

        for (String palavra : palavras) {
            String palavraMinuscula = palavra.toLowerCase();
            // checa se contém a palavra
            if(contador.containsKey(palavraMinuscula)) {
                int valor = contador.get(palavraMinuscula); // Retorar o valor atual da palavra
                contador.put(palavraMinuscula, valor + 1);
            } else {
                contador.put(palavraMinuscula, 1); // chave e valor
            }
        }

        for (String palavra : contador.keySet()) {
            System.out.println(palavra + " " + contador.get(palavra));
        }
    }
}
