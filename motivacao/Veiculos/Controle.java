package motivacao.Veiculos;

public class Controle {
    public void controlar(Veiculo veiculo) {
        veiculo.moverFrente(); // Consegue controlar qualquer tipo de veiculo (quando se trata de algo escalável é recomendando usar)

        // O compilador consegue discenir o método a partir do objeto. Ou seja, a classe se conhece
        // * Isso também é chamado de polimorfismo de inclusão
    }
}
