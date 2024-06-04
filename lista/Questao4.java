//Escreva um programa que receba uma temperatura em graus centígrados e a apresente
//em graus Fahrenheit.

package lista;
import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner grausCelsius = new Scanner(System.in);

        System.out.print("Informe o grau em celsius: ");
        double pickGrausCelsius = grausCelsius.nextDouble();

        double fahrenheit = (pickGrausCelsius * 1.8) + 32;

        System.out.printf("O grau em fahrenheit eh: %g", fahrenheit);

        grausCelsius.close();
    }
}
