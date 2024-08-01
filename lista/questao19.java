package lista;
import java.util.Scanner;

public class questao19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o numero: ");
        int num = input.nextInt();

        int pickFibbonaci = recursaoFibbonaci(num);
        
        System.out.printf("%d\t\t\n\n", pickFibbonaci);
        input.close();
    }

    public static int recursaoFibbonaci(int num) {
        if(num == 0) {
            return 1;
        }
        return num * recursaoFibbonaci(num - 1);
    }
}
