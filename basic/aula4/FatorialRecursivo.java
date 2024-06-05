package basic.aula4;
import java.util.Scanner;

public class FatorialRecursivo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o numero: ");
        int numero = input.nextInt();

        int resultado = Fatorial(numero);

        System.out.print("O resultado eh " + resultado);

        input.close();
    }

    public static int Fatorial(int num) {
        if(num == 0) {
            return 1;
        } else {
            return num * Fatorial(num - 1); //Fat(num - 1) é um loop, pega numéro num e multiplica pelo anterior dele que é igual a Fat(num - 1);
        }
    }
}
