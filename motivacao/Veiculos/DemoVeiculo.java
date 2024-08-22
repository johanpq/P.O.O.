package motivacao.Veiculos;

public class DemoVeiculo {
    public static void main(String[] args) {
        Aviao aviao = new Aviao(2, 213, 213);
        Carro carro = new Carro(4, 3, 353);
        Barco barco = new Barco(2, 435, 435);

        aviao.moverFrente();
        carro.moverFrente();
        barco.moverFrente();
    }
}
