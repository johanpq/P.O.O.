package lista.questao37;

import java.util.Random;

public class Dado {

    public static int[] dadosSoma() {
        Random random = new Random();

        int n1;
        int n2;
        int listaSoma[] = new int[1];
    
        for(int i = 0; i < 360000; i++) {
            n1 = random.nextInt(6) + 1;
            n2 = random.nextInt(6) + 1;
            listaSoma = new int[n1 + n2];

            for(int j = 0; j < listaSoma.length; j++) {
                listaSoma[j] = n1 + n2;
            }
        }

        return listaSoma;
        
    }


}
/* Escreva um aplicativo para simular o lançamento de dois dados. O aplicativo deve utilizar
um objeto de classe Random, uma vez para lançar o primeiro dado e novamente para
lançar o segundo dado. A soma dos dois valores deve então ser calculada. Cada dado
pode mostrar um valor inteiro de 1 a 6, portanto a soma dos valores irá variar de 2 a
8
12, com 7 sendo a soma mais frequente e 2 e 12, as somas menos frequentes. Seu
aplicativo deve lançar o dado 36.000.000 vezes. Utilize um array unidimensional para
contar o número de vezes que cada possível soma aparece. Exiba os resultados */

// ! modelagem é a explicação do programa.