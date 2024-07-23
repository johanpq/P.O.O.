package basic.Aula8.Tupla;

public class DemoTupla {
    public static void main(String[] args) {
        // * O tipo T e S são passados aqui.
        Tupla<Double, Integer> t1 = new Tupla<Double, Integer>(2.0, 5);

        Tupla<String, Float> t2 = new Tupla<String, Float>("Johan", 5.43f);

        System.out.println(t1.getPrimeiro());
        System.out.println(t2.getSegundo());
    }
}
