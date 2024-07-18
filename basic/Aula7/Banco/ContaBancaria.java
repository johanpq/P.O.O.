package basic.Aula7.Banco;

class ContaBancaria {
    private String nome;
    private double saldo;
    private boolean especial;


    ContaBancaria(String nome, double saldo, boolean especial) { /*Sobrecarga de métodos */
        this.nome = nome;
        this.saldo = saldo;
        this.especial = especial;
    }


    public ContaBancaria(String nome) { /*Sobrecarga de métodos */
        this.nome = nome;
        this.saldo = 0.0;
        this.especial = false;
    }


    public String toString() {
        return "O nome eh " + nome + ", saldo eh " + saldo + "status: " + especial;
    }
}
