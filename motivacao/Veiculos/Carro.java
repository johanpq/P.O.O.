package motivacao.Veiculos;

public class Carro extends Terrestre {
    private int placa;

    public Carro(int capacidade, int qntRodasint, int placa) {
        super(capacidade, qntRodasint);
        this.placa = placa;
    }

    public void moverFrente() {
        System.out.println("Carro movendo para frente");
    }
}
