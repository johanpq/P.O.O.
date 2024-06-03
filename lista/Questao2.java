//Escreva um programa que calcule a soma e a média aritmética de 3 números. Os 3
//valores reais serão informados pelo usuário.

package lista;

import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        Scanner notas = new Scanner(System.in);

        System.out.print("Informe a nota 1: ");
        double pickNota1 = notas.nextDouble();
        
        System.out.print("Informe a nota 2: ");
        double pickNota2 = notas.nextDouble();

        System.out.print("Informe a nota 3: ");
        double pickNota3 = notas.nextDouble();

        double notaAritmetica = (pickNota1 + pickNota2 + pickNota3) / 3;

        System.out.printf("A media eh: %g", notaAritmetica);

    }
}
