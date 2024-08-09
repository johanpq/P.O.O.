package arrays.Aula2;
import java.util.Scanner;

public class Pascal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Numero de linhas: ");
        int nLinhas = input.nextInt();

        int triangulo[][] = new int[nLinhas][]; // A segunda dimensão pode ser vazio

        for(int l = 0; l < triangulo.length; l++) {
            triangulo[l] = new int[ l +  2];
            triangulo[l][0] = 1;
            triangulo[l][triangulo.length - 1] = 1;

            for(int c = 0; c < triangulo.length; c++) {
                
            }
        }

        for(int l = 0; l < triangulo.length; l++ ) {
            for(int c = 0; c < triangulo[l].length; c++) {
                System.out.println(triangulo[l][c] + "");
            }
        }

        input.close();

    }
}
