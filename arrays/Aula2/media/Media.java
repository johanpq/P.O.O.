package arrays.Aula2.media;

public class Media {
    public static void main(String[] args) {
        System.out.println(media(2.5, 3.6));
        System.out.println(media(2.5, 3.6, 5.7, 2.3));

    }

    public static double media(double...numeros) { // * Calcular qualquer quantidade de elementos/parâmetros do tipo double

        double soma = 0.0, media;

        for (double d : numeros) { // itera nos elementos do array (d vira os elementos de numeros(array))
            soma += d;
        }

        media = soma / numeros.length;

        return media;
    }
}
