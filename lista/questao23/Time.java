package lista.questao23;

class Time {
    String nomeDoTime;
    String nomeDoEsporte;
    String nomeDoCampeonato;

    Time(String nomeDoTime, String nomeDoEsporte, String nomeDoCampeonato) {
        this.nomeDoTime = nomeDoTime;
        this.nomeDoEsporte = nomeDoEsporte;
        this.nomeDoCampeonato = nomeDoCampeonato;
    }

    void info() {
        System.out.println("O time " + nomeDoTime + " de " + nomeDoEsporte + " esta participando do campeonato " + nomeDoCampeonato);
    }

    void editarNomeDoTime(String novoNome) {
        this.nomeDoTime = novoNome;
    }

    void infoVerdadeira() {
        System.out.println("Este time " + nomeDoTime + " eh o pior que tem! ");
    }
}

/* Escreva uma classe para representar um time de um esporte qualquer em um campeonato desse esporte. Que atributos devem ser representados nessa classe? Quais métodos ela deve conter? Escreva um aplicativo de teste que demonstre as capacidades da
classe criada. */