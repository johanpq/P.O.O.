/* O mês de fevereiro de 2015 começou em um domingo. Escreva um programa que, dado
o número de um dia do mês de fevereiro de 2015 (um valor entre 1 e 28), imprime o dia
da semana correspondente.
• Exemplo de entrada: 10
• Exemplo de saída: O dia 10 será uma terça-feira. */

package lista;

import java.util.Scanner;

public class Questao12 {
    
    public static void main(String[] args) {
        
        int dia, semana;

        Scanner input = new Scanner(System.in);

        System.out.printf("Digite um dia do mes de fevereio: ");
        dia = input.nextInt();
        semana = (dia - 1) % 7;
        
        switch(semana) {
            case 0:
                System.out.println("O dia " + dia + " é Domingo");
                break;
            case 1:
                System.out.println("O dia " + dia + " é Segunda");
                break;
            case 2:
                System.out.println("O dia " + dia + " é Terça");
                break;
            case 3:
                System.out.println("O dia " + dia + " é Quarta");
                break;
            case 4:
                System.out.println("O dia " + dia + " é Quinta");
                break;
            case 5:
                System.out.println("O dia " + dia + " é Sexta");
                break;
            case 6:
                System.out.println("O dia " + dia + " é Sabado");
                break;
            default:
                
        }    
        input.close();
    }
}