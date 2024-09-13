package lista.questao53;

import java.util.Scanner;

public class Mes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String meses[] = {"Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outrubro", "Novembro", "Dezembro"};

        try {
            System.out.print("Informe um numero inteiro: ");
            int valor = input.nextInt();
    
            for(int i = 0; i < meses.length; i++) {
                if(valor == i) {
                    System.out.println("Mes: " + meses[i]);
                }
            }
        } catch(Exception e) {
            System.out.println("Houve uma exececao! ");
        } finally {
            input.close();
        }

    }
}
/*Escreva um programa que:
• armazene em um vetor os nomes dos meses do ano
• solicite ao usuário que digite um valor inteiro
• mostre o nome do mês correspondente ao número digitado
• trate as exceções geradas pela digitação de valores inválidos para o índice do mês */