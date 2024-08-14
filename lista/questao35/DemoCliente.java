package lista.questao35;
import java.util.Scanner;
import java.util.ArrayList;

public class DemoCliente {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    ArrayList<Cliente>minhaLista = new ArrayList<>();

    String nome, telefone;
    int id = 0, idade = 0;
    boolean controlador = false;

    while(controlador == false) {
        System.out.print("Id:");
        id = input.nextInt();

        if(id < 0) {
            controlador = true;
            break;
        }

        input.nextLine();

        System.out.print("Nome:");
        nome = input.nextLine();

        System.out.print("Idade:");
        idade = input.nextInt();

        input.nextLine();
        
        System.out.print("Telefone:");
        telefone = input.nextLine();

        Cliente novoCliente = new Cliente(id, nome, idade, telefone);

        minhaLista.add(novoCliente);

    }

    for (Cliente i : minhaLista) {
        System.out.println(i);
    }

    input.close();

 }   
}
