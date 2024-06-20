package lista;

public class Questao13 {
    public static void main(String[] args) {
        int[] numerosMegaSena = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60};
        int controlLoop = 0;

        for(int i = 1; i <= numerosMegaSena.length; i++) {
            ++controlLoop;

            if(controlLoop == 11) {
                controlLoop = 1;
                System.out.println();
                System.out.println();
            }

            System.out.printf("%d\t", i);
        }

        System.out.println();

        for(int i = 1; i <= numerosMegaSena.length; i++) {
            ++controlLoop;

            if(controlLoop == 11) {
                controlLoop = 1;
                System.out.println();
                System.out.println();
            }

            System.out.printf("%d\t", i);
        }

        System.out.println();

        for(int i = 1; i <= numerosMegaSena.length; i++) {
            ++controlLoop;

            if(controlLoop == 11) {
                controlLoop = 1;
                System.out.println();
                System.out.println();
            }

            System.out.printf("%d\t", i);
        }
        System.out.println();
    }
}