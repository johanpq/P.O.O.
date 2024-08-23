package lista.Questao42;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNomeFuncionario() {
        return nome;
    }

    public double getSalarioFuncionario() {
        return salario;
    }

    public void aumentarSalario(double valorAumento) {
        salario += valorAumento;
    }

    public void ganhoAnual() {

    }

    public String toString() {
        String res = "";
        res += "Nome: " + nome + "\n";
        res += "Salario: " + salario + "\n";
        return res;
    }
}
/*Implemente a classe Funcionario com nome, salário e os métodos:
• aumentarSalario : recebe o valor do aumento e o adiciona ao salário;
• ganhoAnual : computa o valor recebido em 12 meses e o 13o
;
• e toString : retorna uma representação textual de um objeto de Funcionario.
(i) Crie também a classe Assistente, que também é um funcionário e que possui um
número de matrícula (e seus métodos de acesso), além de um método toString.
(ii) Escreva as classes Tecnico e Administrativo
• Ambas as classes são filhas da classe Assistente
• Ambas as classes devem ter um método ganhoAnual
• Assistentes Técnicos possuem um bônus salarial
• Assistentes Administrativos possuem um turno (dia ou noite) e um adicional noturno
(iii) Lembre-se que o 13o não possui adicional noturno, mas pode possuir bônus salarial
(se aplicável). */