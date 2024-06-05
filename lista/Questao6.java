//Escreva um programa que recebe um valor inteiro representando um intervalo em minutos
//e imprime o equivalente a esse período expresso em valores inteiros para dias, horas e
//minutos. Ex.: 9257 minutos = 6 dias, 10 horas e 17 minutos.

package lista;
import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o intervalo em minutos: ");
        int intervalo = input.nextInt();

        int dias = intervalo / 1440;
        int horas = (intervalo % 1440) / 60;
        int minutos = intervalo % 60;

        System.out.printf("%d dias\n%d horas\n%d minutos\n ", dias, horas, minutos);

        input.close();
    }
}
