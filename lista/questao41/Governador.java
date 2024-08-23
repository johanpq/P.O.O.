package lista.questao41;

public class Governador extends Politico {
    private String estado;

    public Governador(int cpf, String nome, String partido, String estado) {
        super(cpf, nome, partido);
        this.estado = estado;
    }

    public String toString() {
        String res = "";
        String getNome = getNome();
        int getCpf = getCpf();
        String getPartido = getPartido();

        res += "Cpf: " + getNome + "\n";
        res += "Nome: " + getCpf + "\n";
        res += "Partido: " + getPartido + "\n";
        res += "Estado: " + estado + "\n";
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