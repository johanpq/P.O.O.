//Escreva um programa que receba um ângulo em graus e o converta para sua representação em radianos. Divulgue também seno, cosseno, tangente, cossecante, secante e
//cotangente do ângulo.

package lista;
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner anguloEmGraus = new Scanner(System.in);

        System.out.print("Informe o angulo em graus: ");
        double pickAnguloEmGraus = anguloEmGraus.nextDouble();

        double converterRadianos = pickAnguloEmGraus * (Math.PI / 180);

        double seno = Math.sin(converterRadianos);
        double cosseno = Math.cos(converterRadianos);
        double tangente = Math.tan(converterRadianos);
        double cossecante = 1 / converterRadianos;
        double secante = 1 / converterRadianos;
        double cotangente = 1 / converterRadianos;

        System.out.printf("O angulo convertido eh: %g", converterRadianos);
        System.out.printf("Seno: %g\nCosseno: %g\nTangente: %g\nCossecante: %g\nSecante: %g\nCotangente: %g", seno, cosseno, tangente, cossecante, secante, cotangente);

        anguloEmGraus.close();
    }
}

