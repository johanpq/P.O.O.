//Escreva um programa que lê três números e determina qual número é o menor.

package lista;
import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        int n1, n2, n3, numeroMenor;

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o numero 1: ");
        n1 = input.nextInt();

        System.out.print("Informe o numero 2: ");
        n2 = input.nextInt();

        System.out.print("Informe o numero 3: ");
        n3 = input.nextInt();

        numeroMenor = n1;

        if(n2 < numeroMenor) {
            numeroMenor = n2;
        } 
        
        if(n3 < numeroMenor) {
            numeroMenor = n3;
        }

        System.out.printf("O numero menor eh: %d\n", numeroMenor);

        input.close();
    }
}