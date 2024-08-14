package lista.questao34;

public class Matriz {
    private float[][] matriz;

    // Construtor que inicializa a matriz 2x2 com valores fornecidos
    public Matriz(float a11, float a12, float a21, float a22) {
        matriz = new float[2][2];
        matriz[0][0] = a11;
        matriz[0][1] = a12;
        matriz[1][0] = a21;
        matriz[1][1] = a22;
    }

    // Método que calcula o determinante da matriz 2x2
    public float determinante() {
        return (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]);
    }

    // Método que imprime a matriz em formato matricial
    public void imprimirMatriz() {
        System.out.println("[ " + matriz[0][0] + " " + matriz[0][1] + " ]");
        System.out.println("[ " + matriz[1][0] + " " + matriz[1][1] + " ]");
    }
}
