package arrays.Aula1;

public class Example1 {
    public static void main(String[] args) {
        double termosDaSerie[] = new double[50];

        // Inicializa o array
        for(int i = 0; i < termosDaSerie.length; i++) {
            termosDaSerie[i] = 1 / Math.pow(i+1, 2);
        }

        for(int num = 10; num <= 50; num *= 10) {
            calculaEMostraSomatorio(termosDaSerie, num);
        }
    }

    public static void calculaEMostraSomatorio(double vetor[], int qntElementos) {
        double soma = 0.0;
        
        for(int i = 0; i < qntElementos; i++) {
            soma += vetor[i];
        }

        System.out.println("Soma com " + qntElementos + " elemento eh: " + soma);
    }
}
