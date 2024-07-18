package basic.Aula7.Pessoa;

public class DemoPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Johan", 1.75);
        //System.out.println(pessoa.nome); // O nome é privado, então não tenho acesso ao nome

        System.out.println(pessoa.getNome());

        pessoa.setNome("Sei la");

        System.out.println(pessoa.getNome());

        System.out.println(pessoa.getAltura());

        pessoa.setAltura(1.85);

        System.out.println(pessoa.getAltura());

        System.out.println("=====================");

        System.out.println(pessoa.toString()); // ou so "pessoa" que mostra tudo.
    }
}
