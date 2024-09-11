package lista.questao52;

import java.util.Scanner;

public class SomarDoisNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0, b= 0;
        boolean control = false;

        do {
            try {
                System.out.println("Informe o numero 1: ");
                a = input.nextInt();
            } catch(Exception e) {
                System.out.println("Houve uma execacao! ");
            } finally {
                input.nextLine();
            }
            
            try {
                System.out.println("Informe o numero 2: ");
                b = input.nextInt();
            } catch(Exception e) {
                System.out.println("Houve uma execacao! ");
            } finally {
                input.nextLine();
            }

            if(a != 0 && b != 0) {
                control = true;
            } else {
                System.out.println("Valores invalidos! ");
            }

        } while(!control);


        int res = obterIntValido(a, b);
        if(res != 0) {
            System.out.println("A: " + a + "\n" + "B: " + b + "\n" + "Resultado: " + res);
        }

        input.close();
        
    }   

    public static int obterIntValido(int a, int b) {
        return a + b;
    }
}
/*Faça um programa para somar dois números:
• O programa deve conter um método int obterIntValido() para receber um número
inteiro válido
– Enquanto o valor não for um número inteiro, deve-se solicitar um novo número e
exibir uma mensagem de erro.
• O método principal deve utilizar obterIntValido() para obter os dois operandos e apresentar a soma deles
• É obrigatório o uso de tratamento de exceção para realizar esta questão. Respostas
que não utilizarem essa técnica serão completamente desconsideradas. */