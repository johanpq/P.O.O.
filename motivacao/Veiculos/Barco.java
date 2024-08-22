package motivacao.Veiculos;

public class Barco extends Aquatico {
    private int cadBarco;

    public Barco(int capacidade, int profundidade, int cadBarco) {
        super(capacidade, profundidade);
        this.cadBarco = cadBarco;
    }

    public void moverFrente() {
        System.out.println("Barco movendo para frente");
    }
}
