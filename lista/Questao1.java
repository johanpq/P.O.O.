// Escreva um programa que calcule a área de um quadrado. O valor do lado de um quadrado deverá ser informado pelo usuário.

package lista;

import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        double area = 0;

        Scanner baseValue = new Scanner(System.in);
        Scanner heightValue = new Scanner(System.in);

        System.out.print("Informe a base: ");
        double pickBaseValue = baseValue.nextDouble();

        System.out.print("Informe a altura: ");
        double pickHeightValue = heightValue.nextDouble();

        area = pickBaseValue * pickHeightValue;

        System.out.printf("A área é: %g", area);
    } 
}