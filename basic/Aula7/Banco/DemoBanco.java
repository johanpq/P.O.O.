package basic.Aula7.Banco;

public class DemoBanco {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Johan", 0.0, true); // Usuário especial

        System.out.println(conta.toString());

        ContaBancaria conta2 = new ContaBancaria("Pedro"); // Usuário comum

        System.out.println(conta2.toString());

        // * Como há a sobrecarga de construtores, na hora de declarar o compilador já sabe qual construtor(ou qualquer outro método que esteja sobrecarregado) pegar baseando-se pelos parâmetros do método.
    }
}
