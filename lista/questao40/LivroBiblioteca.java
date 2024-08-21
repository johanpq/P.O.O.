package lista.questao40;

public class LivroBiblioteca extends Livro {
    String pessoaPegarLivro;

    public LivroBiblioteca(String titulo, String editora, boolean capaDura, boolean capaNormal, boolean marcador, String pessoaPegarLivro) {
        super(titulo, editora, capaDura, capaNormal, marcador);
        this.pessoaPegarLivro = pessoaPegarLivro;
    }


    public String toString() {
        String res = "";
        String getLivrosAtributos = getTodosAtributos();

        res += getLivrosAtributos + "\n";
        res += pessoaPegarLivro + "\n";
        return res;
    }

}
/*Escreva as classes LivroLivraria e LivroBiblioteca que herdam da classe Livro. Quais as
diferenças entre as duas classes e que campos elas têm em comum? Defina os atributos
de cada classe e escreva um aplicativo de teste que demonstre o uso das classes criadas */ 