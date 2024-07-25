package lista.questao28;

public class DemoLampada {
    public static void main(String[] args) {
        Lampada lamp = new Lampada(false);

        boolean estarLigada = lamp.estarLigada();

        System.out.println(estarLigada);

        lamp.acende();

        estarLigada = lamp.estarLigada();

        System.out.println(estarLigada);

        
        lamp.apaga();

        estarLigada = lamp.estarLigada();

        System.out.println(estarLigada);

        lamp.mostraEstado();

        lamp.getContador();

    }
}
