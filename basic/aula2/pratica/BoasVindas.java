import java.util.Scanner;

public class BoasVindas {

    public static void main(String[] args) {
        String nome;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");

        nome = input.next();

        System.out.print("Welcome " + nome);

        input.close(); /* Quando não for usar mais o input */
    }

}