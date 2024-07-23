package basic.Aula8.Circulo;

public class Circulo {
    private double raio;
    public static final double pi = 3.14; // final é constante


    Circulo(double raio) {
        this.raio = raio;
    }


    double calculaPerimetro() {
        return 2 * pi * raio;
    }
}
