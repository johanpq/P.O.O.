package interfacee;

public abstract class Empregado implements Pagavel { // Por ser uma classe abstrata não haverá métodos concretos, quem fará isso é o filho desta classe
    private String nome;
    private String carteiraDeTrabalho;

    public Empregado(String nome, String cateiraDeTrabalho) {
        this.nome = nome;
        this.carteiraDeTrabalho = cateiraDeTrabalho;
    }
}
