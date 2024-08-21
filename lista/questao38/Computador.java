package lista.questao38;

public class Computador extends Equipamento {
    private String computador;
    private String memoria;

    Computador(String mouse, String teclado, String computador, String memoria) {
        super(mouse, teclado);
        this.computador = computador;
        this.memoria = memoria;
    }

    public void setComputador(String computador) {
        this.computador = computador;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getComputador() {
        return computador;
    }

    public String getMemoria() {
        return memoria;
    }

    public String toString() {
        String res = "";
        String getMouse = super.getMouse();
        String getTeclado = super.getTeclado();
        String getComputador = getComputador();
        String getMemoria = getMemoria();
        res += "Mouse: " + getMouse  + "\n";
        res += "Teclado: " +  getTeclado + "\n";
        res += "Computador " + getComputador + "\n";
        res += "Memoria " + getMemoria + "\n";

        return res;
    }
}
/* Crie as classes Equipamento e Computador, cada uma com dois atributos privados à
sua escolha. Além disso, a classe Computador deverá herdar os métodos e atributos
da classe Equipamento. Escreva métodos de acesso, get’s e set’s, para os atributos
definidos em ambas as classes. Cada classe também deve ter um método toString.
Lembre-se que o método toString de Computador também deve representar os atributos
herdados. Por fim, crie uma classe executável, TestaEquipamento, para instanciar um
objeto de cada classe, inicializar seus atributos e imprimí-los. */