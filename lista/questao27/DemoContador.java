package lista.questao27;

public class DemoContador {
    public static void main(String[] args) {
        Contador cont = new Contador(10);

        cont.imprimir();
        cont.incrementar();
        cont.imprimir();
        cont.zerar();
        cont.incrementar();
        cont.imprimir();
    }
}

/*Escreva a classe Contador que encapsule um valor usado para contagem de eventos.
Esta classe deve esconder o valor encapsulado de programadores-usuários, fazendo
com que o acesso ao valor seja feito através de métodos que devem zerar, incrementar e imprimir o valor do contador. Escreva um aplicativo de teste que demonstre as
capacidades da classe criada. */