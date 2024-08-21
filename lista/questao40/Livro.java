package lista.questao40;

public class Livro {
    private String titulo;
    private String editora;
    private boolean capaDura;
    private boolean capaNormal;
    private boolean marcador;


    public Livro(String titulo, String editora, boolean capaDura, boolean capaNormal, boolean marcador) {
        this.titulo = titulo;
        this.editora = editora;
        capaDura ? this.capaDura = capaDura : this.capaDura = false;
        capaNormal ? this.capaNormal = capaNormal : this.capaNormal = false;
        this.marcador = marcador;
    }

    public String getTodosAtributos() {
        String res = "";
        res += "Titulo: " + titulo + "\n";
        
        res += "Editora: " + editora + "\n";
        res += "Capa dura: " + capaDura + "\n";
        res += "Capa normal: " + capaNormal + "\n";
        res += "Marcador: " + marcador + "\n";
        return res;
    }

    public String toString() {
        String res = "";
        res += "Titulo: " + titulo + "\n";
        res += "Editora: " + editora + "\n";
        res += "Capa dura: " + capaDura + "\n";
        res += "Capa normal: " + capaNormal + "\n";
        res += "Marcador: " + marcador + "\n";
        return res;
    }
}
/*Escreva as classes LivroLivraria e LivroBiblioteca que herdam da classe Livro. Quais as
diferenças entre as duas classes e que campos elas têm em comum? Defina os atributos
de cada classe e escreva um aplicativo de teste que demonstre o uso das classes criadas */