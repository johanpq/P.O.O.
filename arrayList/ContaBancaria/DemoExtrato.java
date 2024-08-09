package arrayList.ContaBancaria;

import java.util.Scanner;

public class DemoExtrato {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double valor, saque;

        Extrato extrato = new Extrato();

        int option;

        do {

            System.out.println("1 - Deposito");
            System.out.println("2 - Saque");
            System.out.println("3 - Visualizar extrato");
            System.out.println("4 - Encerrar");

            System.out.println("Opcao: ");
            option = input.nextInt();

            switch(option) {
                case 1:
                    System.out.println("Valor do deposito: ");
                    valor = input.nextDouble();

                    extrato.transacao(valor);

                    break;

                case 2:
                    System.out.println("Valor do saque: ");
                    saque = input.nextDouble();

                    extrato.transacao(-saque); // É o saque por isso ele vai tirar do banco, por isso -

                    break;

                case 3:
                    extrato.vizualizar();
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Opcao invalida");
            }
        } while (option != 4);

        input.close();
    }    
}
