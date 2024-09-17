package lista.questao44;

public class InfoFuncionario {
    private String nome;
    private int horasTrabalhadas;
    private double salarioPorHora;
    private double salario;

    public InfoFuncionario(String nome) {
        this.nome = nome;
        this.horasTrabalhadas = 0;
        this.salarioPorHora = 0.0;
        this.salario = 0.0;
    }

    public InfoFuncionario(String nome, int horasTrabalhadas, double salarioPorHora) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.salarioPorHora = salarioPorHora;
        this.salario = horasTrabalhadas * salarioPorHora; 
    }

    public String toString() {
        String res = "";
        res += "Nome: " + nome + "\n";
        if(horasTrabalhadas != 0) {
            res += "Horas trabalhadas: " + horasTrabalhadas + " horas" + "\n";
        } 
        res += "Salario: " + salario + "\n";

        return res;
    }
}

/*Defina uma classe para conter informações sobre um funcionário de uma empresa (classe
Funcionario). Quais são os atributos dessa classe? Inclua entre eles o salário que o funcionário deve receber por hora trabalhada. Implemente, para essa classe, pelo menos
dois métodos construtores: um que receba apenas o nome do funcionário e assuma valores padrão para os demais atributos (assuma que o funcionário deve receber dois reais
por hora trabalhada); o segundo construtor deve receber, além do nome, o valor que o referido trabalhador deve receber por hora trabalhada. Identifique e implemente os demais
métodos que achar conveniente para um objeto da classe Funcionario. */
