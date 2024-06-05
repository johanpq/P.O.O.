package basic.aula4;
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2, num3;

        System.out.print("Informe 3 numeros: \n");
        num1 = input.nextDouble();
        num2 = input.nextDouble();
        num3 = input.nextDouble();

        double resultado = media(num1, num2, num3);

        System.out.printf("O resultado eh: %g", resultado);

        input.close();
    }


    public static double media(double n1, double n2, double n3) {
        double soma = n1 + n2 + n3;
        double med = soma / 3;

        return med;
    }
}

