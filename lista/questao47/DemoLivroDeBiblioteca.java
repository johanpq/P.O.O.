package lista.questao47;

public class DemoLivroDeBiblioteca {
    public static void main(String[] args) {
        LivrosDeBiblioteca livro1 = new LivrosDeBiblioteca("Seila", "A1", 200, 2020, 001, false);

        System.out.println(livro1);

        boolean isEmprestado = livro1.estaEmprestado();

        System.out.println(isEmprestado);

        livro1.empresta();

        boolean isEmprestado1 = livro1.estaEmprestado();

        System.out.println(isEmprestado1);
    }
}
/*Crie uma interface ItemDeBiblioteca que declara quais campos e métodos uma classe
que representa um item para empréstimo em uma biblioteca deve implementar. Essa
interface é composta por um campo maximoDeDiasParaEmprestimo com valor 14 e os
seguintes métodos:
• estaEmprestado : retorna verdadeiro se o item estiver emprestado e falso caso contrário;
• empresta : modifica para verdadeiro o estado de um campo que indica se o item
está emprestado ou não;
• devolve : modifica para falso o estado de um campo que indica se o item está emprestado ou não;
• localizacao : retorna um texto que informa o local do item na biblioteca (e.g: "corredor 2, prateleira D");
• descricao : retorna texto contendo uma descrição resumida do item (e.g.: "artigo da
ECOP").

Implemente também a classe Livro que encapsula os dados genéricos sobre um livro
e métodos para processar estes dados. Essa classe é composta pelos atributos titulo,
autor, numeroDePaginas e anoDaEdicao, além dos seguintes métodos:
• construtor;
• qualTitulo: retorna o título do livro;
• qualAutor: retorna o autor do livro;
• toString: retorna os valores dos campos desta classe em formato textual.
Em seguida, escreva a classe LivroDeBiblioteca que herda os campos e métodos da
classe Livro e implementa os métodos declarados na interface ItemDeBiblioteca. LivroDeBiblioteca também deve possuir um construtor e um método toString. Crie os atributos
que forem necessários.
Por fim, crie a classe DemoLivroDeBiblioteca para demonstrar o uso de uma instância da
classe LivroDeBiblioteca, isto é, criar um objeto do tipo LivroDeBiblioteca e executar seus
métodos. **/