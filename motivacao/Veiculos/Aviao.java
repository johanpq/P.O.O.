package motivacao.Veiculos;

public class Aviao extends Aereo {
    private int seila;

    public Aviao(int capacidade, int cadAnac, int seila) {
        super(capacidade, cadAnac);
        this.seila = seila;
    }

    public void moverFrente() {
        System.out.println("Aviao movendo para frente");
    }
}
