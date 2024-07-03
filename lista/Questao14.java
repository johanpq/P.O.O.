package lista;

public class Questao14 {
    public static void main(String[] args) {
        int n = 10; // Número de termos na série de Fibonacci
        int num1 = 0, num2 = 1;

        System.out.print("Serie de Fibonacci ate " + n + " termos: ");

        for (int i = 1; i <= n; ++i) {
            System.out.print(num1 + " ");

            // Calcula o próximo termo
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }
    }
}