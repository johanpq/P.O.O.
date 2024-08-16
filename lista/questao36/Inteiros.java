package lista.questao36;

public class Inteiros {
    public static void produto(int... inteiros) {
        int produto = 1;
        for(int i : inteiros) {
            produto *= i;
        }

        System.out.println("Produto eh: " + produto);
    }
}
/* Escreva um aplicativo que calcula o produto de uma série de inteiros que são passados
para um método produto utilizando uma lista de argumentos de comprimento variável.
Escreva também uma classe executável que teste seu método com várias chamadas,
cada uma com um número diferente de argumentos. */