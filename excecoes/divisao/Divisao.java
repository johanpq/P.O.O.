package excecoes.divisao;

import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int res = 0;

        try {
            System.out.println("Numerador: ");
            int n = input.nextInt();
    
            System.out.println("Denominador: ");
            int d = input.nextInt();

            res = divisao(n, d);
        } catch(Exception e) {
            System.out.println("Houve uma execacao!");
        } finally {
            input.close();
        }

        System.out.println("Resultado " + res);

    }

    public static int divisao(int num, int den) {
        return num / den;
    }
}
