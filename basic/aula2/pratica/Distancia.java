import java.util.Scanner;

public class Distancia {

    public static void main(String[] args) {
        double x1, y1, x2, y2, dist;

        Scanner input = new Scanner(System.in);

        System.out.print("X1: ");
        x1 = input.nextDouble();

        System.out.print("Y1: ");
        y1 = input.nextDouble();

        System.out.print("X2: ");
        x2 = input.nextDouble();

        System.out.print("Y2: ");
        y2 = input.nextDouble();

        dist = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)); /* O Math já é parte do pacote Java */


        System.out.printf("A distancia entre %g, %g e %g e %g eh %g", x1, y1, x2, y2, dist);

        input.close();
    }
}