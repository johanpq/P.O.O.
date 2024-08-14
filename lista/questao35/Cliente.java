package lista.questao35;

public class Cliente {
    private int id;
    private String nome;
    private int idade;
    private String telefone;

    public Cliente(int id, String nome, int idade, String telefone) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }

    public String toString() {
        String res = "";
        res += "Id: " + id + "\n"; 
        res += "Nome: " + nome + "\n"; 
        res += "Idade: " + idade + "\n"; 
        res += "Telefone: " + telefone + "\n"; 
        return res;
    }

}

/*Crie um objeto de uma classe chamada Cliente com os atributos id, nome, idade, telefone.
Faça um programa para solicitar os dados de vários clientes e armazenar em um ArrayList
até que se digite um número de id negativo. Em seguida, exiba os dados de todos os
clientes. */