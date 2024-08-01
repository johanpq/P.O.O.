package arrayList.Aula1;

public class Array {
    public static void main(String[] args) {
        int arrayUnidimensional[] = new int[1]; 
        char letrasAlfabetos[] = {'a', 'b'};

        boolean resposta[] = new boolean[12];

        resposta = new boolean[144]; // Não estou aumentando o tamanho, resposta vai tá apontando para esse novo objeto e não o bollean de 12, mas ainda terá dados no do 12(caso o use).


        System.out.println(arrayUnidimensional[0]);

        int newArray[] = new int[5];

        for(int i = 0; i < newArray.length; i++) {
            System.out.println(resposta[i]);
        }
    }
}
