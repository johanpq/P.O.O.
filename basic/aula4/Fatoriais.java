package basic.aula4;

import java.util.Scanner;

public class Fatoriais {
    public static void main(String[] args) {
        int num, fat = 1;
        
        Scanner input = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        num = input.nextInt();

        for(int i = 0; i <= num; i++) {
            for(int i2 = i; i2 > 1; i2--) {
                fat *= i2; 
                System.out.print("O fatorial de " + i + " eh " + fat);
            }
        }

        input.close();
    }
}
