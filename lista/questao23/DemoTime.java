package lista.questao23;

public class DemoTime {
    public static void main(String[] args) {
        Time meuTime = new Time("Vasco", "Futebol", "Champions League");

        meuTime.info();

        meuTime.editarNomeDoTime("Corinthias");

        meuTime.infoVerdadeira();
    }
}

/* Escreva uma classe para representar um time de um esporte qualquer em um campeonato desse esporte. Que atributos devem ser representados nessa classe? Quais métodos ela deve conter? Escreva um aplicativo de teste que demonstre as capacidades da
classe criada. */
