package motivacao.Veiculos;

public abstract class Veiculo { // Se uma class é abstrata, não é possível instanciar.
    int capacidade;

    Veiculo(int capacidade) {
        this.capacidade = capacidade;
    }

    public abstract void moverFrente();
}

/*/*Uma classe abstrata é uma classe que não pode ser instanciada diretamente; ela deve ser estendida por outras classes. Você usa classes abstratas quando deseja criar uma classe base que fornece algum comportamento padrão, mas deixa partes da implementação para as subclasses. */ */