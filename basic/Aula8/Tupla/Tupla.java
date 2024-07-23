package basic.Aula8.Tupla;

public class Tupla <P, S> { // P e S são dois tipos genéricos
    private P primeiro;
    private S segundo;


    Tupla(P primeiro, S segundo) {
        this.primeiro = primeiro;
        this.segundo = segundo;
    }

    P getPrimeiro() {
        return primeiro;
    }

    void setPrimeiro(P primeiro) {
        this.primeiro = primeiro;
    } 

    S getSegundo() {
        return segundo;
    }

    void setSegundo(S segundo) {
        this.segundo = segundo;
    }
}
