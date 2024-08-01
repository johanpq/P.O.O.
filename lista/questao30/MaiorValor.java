package lista.questao30;

public class MaiorValor {
    
    public static int MaiorDoisValores(int a, int b) {
        int maior = a;
        if(b > maior) {
            maior = b;
        }
        return maior;
    }

    public static double MaiorDoisValores(double a, double b) {
        double maior = a;
        if(b > maior) {
            maior = b;
        } 
        return maior;
    }

    public static int MaiorTresValores(int a, int b, int c) {
        int maior = a;

        if(b > maior) {
            maior = b;
        }

        if(c > maior) {
            maior = c;
        }
 
        return maior;
    }

    public static double MaiorTresValores(double a, double b, double c) {
        double maior = a;

        if(b > maior) {
            maior = b;
        }

        if(c > maior) {
            maior = c;
        }

        return maior;
    }

    public static int MaiorQuatroValores(int a, int b, int c, int d) {
        int maior = a;

        if(b > maior) {
            maior = b;
        }

        if(c > maior) {
            maior = c;
        }

        if(d > maior) {
            maior = d;
        }

        return maior;
    }

    public static double MaiorQuatroValores(double a, double b, double c, double d) {
        double maior = a;

        if(b > maior) {
            maior = b;
        }

        if(c > maior) {
            maior = c;
        }

        if(d > maior) {
            maior = d;
        }

        return maior;
    }

    public static int MaiorCincoValores(int a, int b, int c, int d, int e) {
        int maior = a;

        if(b > maior) {
            maior = b;
        }

        if(c > maior) {
            maior = c;
        }

        if(d > maior) {
            maior = d;
        }

        if(e > maior) {
            maior = e;
        }

        return maior;
    }

    public static double MaiorCincoValores(double a, double b, double c, double d, double e) {
        double maior = a;

        if(b > maior) {
            maior = b;
        }

        if(c > maior) {
            maior = c;
        }

        if(d > maior) {
            maior = d;
        }

        if(e > maior) {
            maior = e;
        }

        return maior;
    }
}
