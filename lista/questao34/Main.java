package lista.questao34;

public class Main {
    public static void main(String[] args) {
        // Criação de uma matriz 2x2 com valores fornecidos
        Matriz matriz = new Matriz(1.0f, 2.0f, 3.0f, 4.0f);

        // Impressão da matriz no formato matricial
        System.out.println("Matriz 2x2:");
        matriz.imprimirMatriz();

        // Cálculo e impressão do determinante da matriz
        float determinante = matriz.determinante();
        System.out.println("Determinante da matriz: " + determinante);
    }
}

/*Escreva uma classe que encapsule uma matriz de tamanho 2 × 2 de valores do tipo float
usando um array de duas dimensões. Nesta classe, além do construtor, escreva um
método que calcule o determinante da matriz encapsulada e um método que permita a
impressão em formato matricial dos seus valores. Escreva um aplicativo de teste que
demonstre as capacidades da classe criada. */