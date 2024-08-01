package lista.questao32;

public class DemoGenerica {
    public static void main(String[] args) {
        Generica <Integer> teste = new Generica<Integer>(5, 2, 4); 

        teste.qntIguais();
    }
}
