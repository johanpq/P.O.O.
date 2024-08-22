package motivacao.Veiculos;

public abstract class Aquatico extends Veiculo {
    private int profundidade;

    Aquatico(int capacidade, int profundidade) {
        super(capacidade);
        this.profundidade = profundidade;
    }
}
