package lista.questao26;

import java.util.Scanner;

public class DemoElevador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Elevador pessoas = new Elevador(2, 4, 5, 1);

        pessoas.entrarElevador();
        pessoas.sairElevador();
        pessoas.sairElevador();
        pessoas.desceElevador();
        pessoas.desceElevador();
        pessoas.desceElevador();
        pessoas.entrarElevador();
        pessoas.sobeElevador();
        pessoas.sobeElevador();
        pessoas.sobeElevador();
        pessoas.sobeElevador();
        pessoas.sobeElevador();
        pessoas.desceElevador();
        pessoas.entrarElevador();
        pessoas.entrarElevador();
        pessoas.entrarElevador();
        pessoas.entrarElevador();
        pessoas.entrarElevador();
        

        input.close();
    }
}
