package motivacao.Veiculos;

public abstract class Terrestre extends Veiculo {
    private int qntRodas;


    Terrestre(int capacidade, int qntRodas) {
        super(capacidade);
        this.qntRodas = qntRodas;
    }
}
