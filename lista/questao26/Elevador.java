package lista.questao26;

class Elevador {
    private int numAndarAtual;
    private int totalAndares;
    private int capaciElevador;
    private int pessoaNoElevador;


    Elevador(int numAndarAtual, int totalAndares, int capaciElevador, int pessoaNoElevador) {
        this.numAndarAtual = numAndarAtual;
        this.totalAndares = totalAndares;
        this.capaciElevador = capaciElevador;
        this.pessoaNoElevador = pessoaNoElevador;
    }

    void entrarElevador() {
        if(!(pessoaNoElevador == capaciElevador)) {
            pessoaNoElevador++;
            System.out.println("Entrou no elevador!");
            System.out.println("Quantidade de pessoas no elevador: " + pessoaNoElevador);
        } else {
            System.out.println("Capacidade do elevador excedida!");
        }
    }
    
    void sairElevador() {
        if(pessoaNoElevador <= 0) {
            System.out.println("Nao ha ninguem no elevador!");
        } else {
            pessoaNoElevador--;
            System.out.println("Saiu uma pessoa! Total de pessoa no elevador: " + pessoaNoElevador);
        }
    }

    void sobeElevador() {
        if(!(numAndarAtual == totalAndares)) {
            numAndarAtual++;
            System.out.println("Subiu um andar! Andar atual: " + numAndarAtual);
        } else {
            System.out.println("Ja esta no ultimo andar!");
        }
    }

    void desceElevador() {
        if(!(numAndarAtual == 0)) {
            numAndarAtual--;
            System.out.println("Desceu um andar! Andar atual: " + numAndarAtual);
        } else {
            System.out.println("Ja esta no terreo!");
        }
    }
}



/*26. Crie uma classe denominada Elevador para armazenar as informações de um elevador
dentro de um prédio. A classe deve armazenar o número do andar atual, o total de
andares no prédio, a capacidade do elevador e quantas pessoas estão presentes nele.
Outras classes não devem ter acesso direto aos atributos de Elevador. A classe deve
também disponibilizar os seguintes métodos:
• construtor : que deve receber como parâmetros a capacidade do elevador e o total
de andares no prédio (um elevador sempre começa no térreo e vazio);
• entra : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda
houver espaço);
• sai : para remover uma pessoa do elevador (só deve remover se houver alguém
dentro dele);
• sobe : para subir um andar (não deve subir se já estiver no último andar);
• desce : para descer um andar (não deve descer se já estiver no térreo).
Escreva um aplicativo de teste que demo */