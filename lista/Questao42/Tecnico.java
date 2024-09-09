package lista.Questao42;

public class Tecnico extends Assistente {
    private double bonusSalarial;

    public Tecnico(String nome, double salario, int numeroMatricula, double bonusSalarial) {
        super(nome, salario, numeroMatricula);
        this.bonusSalarial = bonusSalarial;
    }

    public double ganhoAnual() {
        return (getSalarioFuncionario() * 12) + (getSalarioFuncionario() + bonusSalarial);
    }

    public String toString() {
        String res = "";
        String getNomeTecnico = getNomeFuncionario();
        int getMatriculaTecnico = getNumeroMatricula();
        double getSalarioTecnico = getSalarioFuncionario();

        res += "Nome: " + getNomeTecnico + "\n";
        res += "Numero de matricula: " + getMatriculaTecnico + "\n";
        res += "Salario: " + getSalarioTecnico + "\n";
        res += "Bonus salarial: " + bonusSalarial + "\n";
        res += "Ganho anual " + ganhoAnual() + "\n";
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