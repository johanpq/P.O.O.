package basic.Aula8.Igualdade;

public class EhIgual {
    public static boolean ehIgual(Integer i1, Integer i2) { // Integer é igual a int, mas o Integer é da API do java, para utilziar o método equals, tem que tipar com os métodos da API. double -> Double, float -> Float, String -> String.
        return i1.equals(i2);
    }


    public static <T> boolean ehIgualClassGenerica(T n1, T n2) { // T é o tipo.
        return n1.equals(n2);
    }
}

/* Poderia criar uma sobrecarga da função ehIgual, mas para não criar muitas função com o mesmo nome e trocando os tipos (isso é sobrecarga) */