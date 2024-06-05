//Escreva um programa que receba um número de 3 dígitos no formato CDU (Centena,
//Dezena e Unidade) e, utilizando operadores aritméticos, armazene cada dígito em uma
//variável de tipo inteiro. Por fim, reescreva o número no formato UCD. Exemplo: 123 deve
//ser reescrito como 312.

package lista;
import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        int num;

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o numero: ");
        num = input.nextInt();

        int C = num / 100;
        int D = (num % 100) / 10;
        int U = num % 10;

        int novoNum = U * 100 + C * 10 + D;

        System.out.printf("Novo numero eh: %d", novoNum);

        input.close();
    }
}
