package lista.Questao42;

public class Administrativo extends Assistente {
    private String turno;
    private double adicionalNoturno;

    public Administrativo(String nome, double salario, int numeroMatricula, String turno, double adicionalNoturno) {
        super(nome, salario, numeroMatricula);
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
    }

    public double ganhoAnual() {
        if(turno.equals("Noite")) {
            return (getSalarioFuncionario() * 12) + (getSalarioFuncionario() + adicionalNoturno);
        } else {
            return super.ganhoAnual();
        }
    }

    public String toString() {
        String res = "";
        String getNomeAdministrativo = getNomeFuncionario();
        int getMatriculaAdministrativo = getNumeroMatricula();
        double getSalarioAdministrativo = getSalarioFuncionario();

        res += "Nome administrativo: " + getNomeAdministrativo + "\n";
        res += "Matricula: " + getMatriculaAdministrativo + "\n";
        res += "Salario: " + getSalarioAdministrativo + "\n";
        res += "Turno: " + turno + "\n";
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