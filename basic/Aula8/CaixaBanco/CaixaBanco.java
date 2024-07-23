package basic.Aula8.CaixaBanco;

public class CaixaBanco {
    private int numCaixa;
    private static int clientesAtendidos = 0; // Inicializa aqui



    CaixaBanco(int numCaixa) {
        this.numCaixa = numCaixa;
        // ! Não inicializa no construtor a variável estática
    }

    void iniciaAtendimento() {
        System.out.println("Caixa " + numCaixa + " atendendo o cliente " + (++clientesAtendidos));
    }

}
