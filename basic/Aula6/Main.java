package basic.Aula6;

public class Main {
    public static void main(String[] args) {
        Triangulo t1, t2, t3; // Criando referências. Está com valor null

        t1 = new Triangulo(); // Criando uma instância do t1
        t2 = new Triangulo(); // Criando uma instância do t2

        t1.inicializar(3, 4, 5, "Triangulo retangulo");

        t2.inicializar(3, 4, 5, "Triangulo retangulo");

        // * t1 e t2 não são iguais mesmo recebendo os valores. Pois os valores criados como referências apontam para diferente endereço de memória (falando sobre as referências, não o objeto).

        t3 = t1; // * Aqui o t3 vai ser igual ao t1, mesmo se criar a instancia t3 = new Triangulo(), seria apagado e t3 seria igual a t1. T3 aponta para t1.

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        // ! se colocar t3 == t1, compara os endereços
    }
}
