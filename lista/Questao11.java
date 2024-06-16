/*Escreva um programa que lê dois pontos no plano cartesiano com coordenadas x e y e
informa se o segundo ponto está acima, abaixo, à esquerda e/ou à direita do primeiro. */

package lista;
import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        double x1,x2,y1,y2;

        Scanner input = new Scanner(System.in);

        System.out.print("Informe x1: ");
        x1 = input.nextDouble();

        System.out.print("Informe x2: ");
        x2 = input.nextDouble();

        System.out.print("Informe y1: ");
        y1 = input.nextDouble();

        System.out.print("Informe y2: ");
        y2 = input.nextDouble();

        if(x1 > x2) {
            System.out.print("O segundo ponto esta a esquerda! \n");
        } else {
            System.out.print("O segundo ponto esta a direita! \n");
        }

        if(y1 > y2) {
            System.out.print("O segundo ponto esta acima do primeiro ponto! \n");
        } else {
            System.out.print("O segundo ponto esta abaixo do primeiro ponto! \n");
        }

        input.close();
    }
}