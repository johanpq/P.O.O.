package lista.questao30;

public class MaiorValor {
    
    public static int MaiorDoisValores(int a, int b) {
        if(a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static double MaiorDoisValores(double a, double b) {
        if(a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int MaiorTresValores(int a, int b, int c) {
        int maior = a;

        if(a > b && a > c) {
            maior = a;
        }

        if(b > a && b > c) {
            maior = b;
        }

        if(c > a && c > b) {
            maior = c;
        }

        return maior;
    }

    public static double MaiorTresValores(double a, double b, double c) {
        double maior = a;

        if(a > b && a > c) {
            maior = a;
        }

        if(b > a && b > c) {
            maior = b;
        }

        if(c > a && c > b) {
            maior = c;
        }

        return maior;
    }

    public static int MaiorQuatroValores(int a, int b, int c, int d) {
        int maior = a;

        if(a > b && a > c && a >d) {
            maior = a;
        }

        if(b > a && b > c && b > d) {
            maior = b;
        }

        if(c > a && c > b && c > d) {
            maior = c;
        }

        if(d > a && d > b && d > c) {
            maior = d;
        }

        return maior;
    }

    public static double MaiorQuatroValores(double a, double b, double c, double d) {
        double maior = a;

        if(a > b && a > c && a >d) {
            maior = a;
        }

        if(b > a && b > c && b > d) {
            maior = b;
        }

        if(c > a && c > b && c > d) {
            maior = c;
        }

        if(d > a && d > b && d > c) {
            maior = d;
        }

        return maior;
    }

    public static int MaiorCincoValores(int a, int b, int c, int d, int e) {
        int maior = a;

        if(a > b && a > c && a > d && a > e) {
            maior = a;
        }

        if(b > a && b > c && b > d && b > e) {
            maior = b;
        }

        if(c > a && c > b && c > d && c > d) {
            maior = c;
        }

        if(d > a && d > b && d > c && d > e) {
            maior = d;
        }

        if(e > a && e > b && e > c && e > d) {
            maior = e;
        }

        return maior;
    }

    public static double MaiorCincoValores(double a, double b, double c, double d, double e) {
        double maior = a;

        if(a > b && a > c && a > d && a > e) {
            maior = a;
        }

        if(b > a && b > c && b > d && b > e) {
            maior = b;
        }

        if(c > a && c > b && c > d && c > d) {
            maior = c;
        }

        if(d > a && d > b && d > c && d > e) {
            maior = d;
        }

        if(e > a && e > b && e > c && e > d) {
            maior = e;
        }

        return maior;
    }
}
