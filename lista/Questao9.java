/* Escreva um programa que lê um número que representa o valor da carta, de um (ás) a
treze (rei), e outro número correspondente ao naipe (1 = ouros, 2 = paus, 3 = copas e 4 =
espadas). O programa deve imprimir o nome da carta por extenso. */

package lista;
import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        int sair = -1, naipe = 0;
        int numeroCarta;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Informe o numero da carta: ");
            numeroCarta = input.nextInt();
            if(numeroCarta >= 1 && numeroCarta <= 13) {
                Menu();
                naipe = input.nextInt();
                switch(naipe) {
                    case 1:
                        System.out.printf("%d de Ouros", numeroCarta);
                        break;
                    case 2:
                        System.out.printf("%d de Paus", numeroCarta);
                        break;
                    case 3:
                        System.out.printf("%d de Copas", numeroCarta);
                        break;
                    case 4:
                        System.out.printf("%d de Espadas", numeroCarta);
                        break;
                    default:
                        System.out.printf("Numero errado, tente novamente! \n");
                        break;
                }
                System.out.print("\nDeseja sair? 0 -> Nao, 1 -> Sim\n");
                sair = input.nextInt();

                while(sair != 0 && sair != 1) {
                    System.out.print("\nDeseja sair? 0 -> Nao, 1 -> Sim\n");
                    sair = input.nextInt();
                }

            } else {
                System.out.println("\nNumero da carta invalido! Tente entre 1 - 13\n");
            }

        } while(sair != 1);

        System.out.println("Saindo...");

        input.close();
    }

    public static void Menu() {
        System.out.println("======= Naipes =======");
        System.out.println("        1.Ouros       ");
        System.out.println("        2.Paus        ");
        System.out.println("        3.Copas       ");
        System.out.println("        4.Espadas     ");
        System.out.println("======================");
    }
}