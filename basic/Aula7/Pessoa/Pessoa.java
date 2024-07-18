package basic.Aula7.Pessoa; // * O que tiver dentro da pasta basic conseguirá pegar as class

class Pessoa {
    private String nome; 
    private double altura;


    Pessoa(String nome, double altura) {
        this.nome = nome;
        this.altura = altura;
    }


    public String getNome() { // Vamos acessar o nome através deste método
       // return nome;
        return "O nome eh " + nome;
    }

    public void setNome(String novoNome) {
        if(!nome.isEmpty()) { // checa se não é vazio
            this.nome = novoNome;
        } 
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double novaAltura) {
        if(altura > 0) {
            this.altura = novaAltura;
        }
    }

    public String toString() {
        return "Nome = " + nome + ", Altura = " + altura;
    }

}

