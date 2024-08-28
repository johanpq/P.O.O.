package lista.questao44;

public class InfoFuncionario {
    private int id;
    private String nome;
    private int horasTrabalhadas;
    private double salario;

    public InfoFuncionario(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public InfoFuncionario(int id, String nome, int horasTrabalhadas, double salario) {
        this.id = id;
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.salario = horasTrabalhadas * salario; 
    }

    public String toString() {
        String res = "";

        res += "Id: " + id + "\n";
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
