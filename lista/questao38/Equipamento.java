package lista.questao38;

public class Equipamento {
    private String mouse;
    private String teclado;

    Equipamento(String mouse, String teclado) {
        this.mouse = mouse;
        this.teclado = teclado;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public void setTeclado(String teclado) {
        this.teclado = teclado;
    }

    public String getMouse() {
        return mouse;
    }

    public String getTeclado() {
        return teclado;
    }

    public String toString() {
        String res = "";
        res += "Mouse: " + mouse + "\n"; 
        res += "Teclado: " + teclado + "\n"; 

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