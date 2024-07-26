package lista.questao30;

public class DemoMaiorValor {
    public static void main(String[] args) {
        int teste1 = MaiorValor.MaiorDoisValores(5, 1);

        System.out.println(teste1);

        double teste2 = MaiorValor.MaiorDoisValores(7.2, 4.5);

        System.out.println(teste2);

        int teste3 = MaiorValor.MaiorTresValores(20, 10, 8);

        System.out.println(teste3);

        double teste4 = MaiorValor.MaiorTresValores(10.2, 7.5, 5.6);

        System.out.println(teste4);

        int teste5 = MaiorValor.MaiorQuatroValores(2, 44, 10, 8);

        System.out.println(teste5);

        double teste6 = MaiorValor.MaiorQuatroValores(1.5, 2.5, 3.5, 4.5);

        System.out.println(teste6);

        int teste7 = MaiorValor.MaiorCincoValores(2, 4, 6, 8, 9);

        System.out.println(teste7);

        double teste8 = MaiorValor.MaiorCincoValores(2.5, 3.5, 4.5, 5.5, 6.6);

        System.out.println(teste8);
    }
}


/* Escreva uma classe que contenha métodos estáticos para retornar o maior de dois, três,
quatro e cinco valores, considerando que os argumentos e o retorno dos métodos podem
ser dos tipos int e double. Em outra classe, escreva um aplicativo de teste que, sem criar
objetos, demonstre as capacidades da classe criada */