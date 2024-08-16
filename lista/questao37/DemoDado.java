package lista.questao37;

public class DemoDado {
    public static void main(String[] args) {
        int soma[] = Dado.dadosSoma();

        for (int i : soma) {
            System.out.println(i);
        }
    }
}
