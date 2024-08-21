package lista.questao40;

public class LivroLivraria extends Livro {
    private double preco;

    public LivroLivraria(String titulo, String editora, boolean capaDura, boolean capaNormal, boolean marcador, double preco) {
        super(titulo, editora, capaDura, capaNormal, marcador);
        this.preco = preco;
    }

    public String toString() {
        String res = "";
        String getLivroAtributos = getTodosAtributos();

        res += getLivroAtributos + "\n";
        res += preco + "\n";
        return res;
    }
}
/*Escreva as classes LivroLivraria e LivroBiblioteca que herdam da classe Livro. Quais as
diferenças entre as duas classes e que campos elas têm em comum? Defina os atributos
de cada classe e escreva um aplicativo de teste que demonstre o uso das classes criadas */ 