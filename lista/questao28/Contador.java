package lista.questao28;

public class Contador {
    private int contador;

    Contador(int contador) {
        this.contador = contador;
    }

    void incrementar() {
        contador++;
    }

    void getContador() {
        System.out.println(contador);
    }
}
