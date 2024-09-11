package excecoes.questionario;

public class Questionario {
    public static void main(String[] args) {
        int respostas[] = {1, 3, 4, 4, 4, 1, 2, 3, 3, 6};
        int contadores[] = new int[6];

        for(int i = 0; i < respostas.length; i++) {
            contadores[i] = 0;
        }

        for (int i : respostas) {
            try {
                contadores[i]++;
            } catch(Exception e) { // pega qualquer tipo de execeção
                System.out.println("Ocorreu uma execacao! ");
                e.printStackTrace();
            } /* catch(ArrayIndexOutOfBoundsException e) { // pega execeção específica
                System.out.println("Alternativa invalida! Deveria ser entre 0 e 5!");
            } */
        }

        for (int i : contadores) {
            System.out.println(i + "");
        }
        System.out.println();

    }
}
