package basic.Aula8.Conversao;

public class DemoUnidades {
    public static void main(String[] args) {
        System.out.println(ConversaoUnidade.milhasParaQuilometros(2.0));
        System.out.println(ConversaoUnidade.pesParaCentimetros(2.0));
        System.out.println(ConversaoUnidade.polegadaParaCentimetros(2.0));
    }
}

/* O método estático não depende das criações de objetos. Por isso é possivel chamar métodos diretamente da class(class estática) */
