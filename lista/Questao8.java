/* Para alavancar as vendas, uma loja resolveu fazer a seguinte promoção relâmpago em
dois setores:

• No setor de Eletros, que possui código 222, todas as peças que custam mais de R$
500 vão ter 10% de desconto.

• No setor de Cama, mesa e banho, que possui código 111, peças com valor acima
de R$ 100 vão ter 40% de desconto, peças que custam entre R$ 50 e R$ 100 vão ter
20% de desconto e peças abaixo de R$ 50 vão ter 10% de desconto.

Escreva um programa que recebe do usuário o código do setor da loja e o valor original de
um produto e imprime na tela o nome do setor e o valor do produto com desconto. Caso
o usuário forneça um código diferente de 111 ou 222, exiba a mensagem Setor Invalido.*/

package lista;
import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        int value, sair = 0;
        String productName; float price; double discount;

        Scanner input = new Scanner(System.in);

        do {
            Menu();
            value = input.nextInt();
            input.nextLine(); //Consumir a linha deixada pelo value pra não da bug;

            switch(value) {
                case 111: 
                    System.out.print("Nome do produto: ");
                    productName = input.nextLine();
                    System.out.print("Preco: ");
                    price = input.nextFloat();

                    if(price < 50) {
                        System.out.print("O preco eh menor do que 50, entao voce possui desconto de 10% \n");

                        discount = price * 0.10;

                        System.out.printf("O desconto eh: %.4g \n", discount);
                        System.out.printf("E o produto fica por %.2f \n\n", price - discount);
                    } else if(price >= 50 && price <= 100) {
                        System.out.print("O preco eh entre 50 e 100, entao voce possui desconto de 20% \n");

                        discount = price * 0.20;

                        System.out.printf("O desconto eh: %.4g \n", discount);
                        System.out.printf("E o produto fica por %.2f \n\n", price - discount);
                    } else if(price > 100) {
                        System.out.print("O preco eh maior do que 100, entao voce possui desconto de 40% \n");

                        discount = price * 0.40; 

                        System.out.printf("O desconto eh: %.4g \n", discount);
                        System.out.printf("E o produto fica por %.2f \n\n", price - discount);
                    }

                    break;
                case 222:
                    System.out.print("Nome do produto: ");
                    productName = input.nextLine();
                    System.out.print("Preco: ");
                    price = input.nextFloat();

                    if(price > 500) {
                        System.out.print("O preco eh maior do que 500, entao voce possui desconto de 10% \n");

                        discount = price * 0.10;

                        System.out.printf("O desconto eh: %.4g \n", discount);
                        System.out.printf("E o produto fica por %.2f \n\n", price - discount);
                    } else {
                        System.out.printf("O preco do %s eh: %.2f \n\n", productName, price);
                    }

                    break;
                case 3:
                    sair = 3;
                    System.out.print("Saindo...");
                    break;
                default:
                    System.out.print("Codigo invalido! \n");
            }
            
        } while(sair != 3);



        input.close();
    }


    public static void Menu() {
        System.out.println("            Loja            ");
        System.out.println("============================");
        System.out.println("  Cama, mesa e banho - 111  ");
        System.out.println("");
        System.out.println("        Eletros - 222       ");
        System.out.println("============================");
        System.out.println("       Saia da loja - 3     ");
        System.out.println("============================");
    }
}