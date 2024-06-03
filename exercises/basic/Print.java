package exercises.basic;
import java.util.Scanner;

public class Print {

    public static void main(String[] args) {
        
        Scanner inputName = new Scanner(System.in);

        System.out.print("Digite o nome da String: ");

        String pickIputName = inputName.nextLine();

        System.out.print("O nome digitado foi: " + pickIputName);

        inputName.close();
    }
}
