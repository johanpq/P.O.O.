package motivacao.Veiculos;

public abstract class Aereo extends Veiculo {
    int cadAnac;

    Aereo(int capacidade, int cadAnac) {
        super(capacidade);
        this.cadAnac = cadAnac;
    }
}
