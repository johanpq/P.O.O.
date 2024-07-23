package basic.Aula8.Circulo;

public class DemoCirculo {
    public static void main(String[] args) {
        System.out.println(Circulo.pi); // É estático por isso posso acessar direto da class, desde que esteja public.
        Circulo c1 = new Circulo(1.5);
        Circulo c2 = new Circulo(1.5);

        System.out.println("Perimetro de c1 " + c1.calculaPerimetro());
        System.out.println("Perimetro de c2 " + c2.calculaPerimetro());
    }
}
