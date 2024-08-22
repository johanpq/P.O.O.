package interfacee;

public class EmpregadoAssalariado extends Empregado {
    private double valorDoSalario;

    public EmpregadoAssalariado(String nome, String carteiraDeTrabalho, double valorDoSalario) {
        super(nome, carteiraDeTrabalho);
        this.valorDoSalario = valorDoSalario;
    }

    public double valorDoPagamento() {
        return valorDoSalario;
    }
}
