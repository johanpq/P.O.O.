package lista.questao28;

public class Lampada {
    private boolean estadoDaLampada;
    private Contador contador = new Contador(0); // * instância da classe contador

    Lampada(boolean estadoDaLampada) {
        this.estadoDaLampada = estadoDaLampada;
    }

    void acende() {
        estadoDaLampada = true;
        contador.incrementar();
    }

    void apaga() {
        estadoDaLampada = false;
    }

    void mostraEstado() {
        System.out.println(estadoDaLampada);
        if(!estadoDaLampada) {  
            System.out.println("Desligado!");
        } else {
            System.out.println("Ligado!");
        }
    }

    boolean estarLigada() {
        if(estadoDaLampada) {
            return true;
        } else {
            return false;
        }
    }

    void getContador() {
        contador.getContador();
    }
}


/*Escreva uma classe Lampada que possui o atributo estadoDaLampada (ligado ou desligado) e os métodos acende, apaga e mostraEstado (ex.: A lampada esta acesa). Inclua
um método estaLigada que retorne verdadeiro se a lâmpada estiver ligada e falso caso
contrário. Adicione um campo que indique quantas vezes a lâmpada foi acesa. Para
isso, utilize uma instância da classe Contador criada anteriormente e implemente a lógica necessária para atualizar seu valor. Escreva um aplicativo de teste que demonstre
as capacidades da classe criada. */