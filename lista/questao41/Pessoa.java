package lista.questao41;

public class Pessoa {
    private int cpf;
    private String nome;


    public Pessoa(int cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String toString() {
        String res = "";
        res += "Cpf: " + cpf + "\n";
        res += "Nome: " + nome + "\n";
        return res;
    }
}
/*Crie uma classe Pessoa com ao menos 2 atributos a sua escolha. Escreva a classe
Politico que herda da classe Pessoa e tem um campo adicional para representar o partido
do político. Escreva também as classes Prefeito e Governador que herdam da classe
Politico e que contém campos para representar a cidade ou estado governado. Todos
atributos devem ser privados. Cada classe deve ter um construtor e um método toString.
Lembre-se que cada método toString deve representar todos os atributos, inclusive os
herdados. Escreva também uma aplicação que demonstre o uso de instâncias destas
classes. */