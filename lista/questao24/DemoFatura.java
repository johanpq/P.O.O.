package lista.questao24;
import java.util.Scanner;

public class DemoFatura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int id, qntComprada;
        String descricao;
        double precoUnitario;

        System.out.print("Informe o id: ");
        id = input.nextInt();

        input.nextLine();

        System.out.print("Informe a descricao: ");
        descricao = input.nextLine();

        System.out.print("Informe o preco do produto: ");
        precoUnitario = input.nextDouble();

        System.out.print("Informe o quantidade comprada: ");
        qntComprada = input.nextInt();

        Fatura myFatura = new Fatura(id, descricao, qntComprada, precoUnitario);

        double total = myFatura.calculaTotal();

        System.out.println("O total eh: " + total);

        input.close();
    }
}


/*Crie uma classe chamada F atura para que uma loja de suprimentos de informática a
utilize para representar uma fatura de um item vendido. Uma Fatura deve incluir as seguintes informações sobre o item vendido: o número de identificação, a descrição, a
quantidade comprada e o preço unitário. Se a quantidade não for positiva, ela deve ser
configurada como 0. Se o preço por item não for positivo, ele deve ser configurado como
0.0. Forneça também um método chamado calculaTotal que calcula e retorna o valor de
fatura (isto é, multiplica a quantidade pelo preço por item). Escreva um aplicativo de teste
que demonstre as capacidades da classe criada. */