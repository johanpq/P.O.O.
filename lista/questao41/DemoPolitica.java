package lista.questao41;

public class DemoPolitica {
    public static void main(String[] args) {
        Governador governador = new Governador(21312, "Servolo", "PT", "RN");
        Prefeito prefeito = new Prefeito(21312312, "João Pedro", "PT", "Almino Afonso");

        System.out.println(governador);
        System.out.println(prefeito);
    }
}
