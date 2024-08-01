package lista.questao32;

public class Generica <P>  {
    private P numero;
    private P string;
    private P dooble;


    Generica(P numero, P string, P dooble) {
        this.numero = numero;
        this.string = string;
        this.dooble = dooble;
    }

    void qntIguais() {
        int qnt = 0;

        if(numero.equals(string)) {
            qnt++;
        }

        if(numero.equals(dooble)) {
            qnt++;
        }

        if(string.equals(dooble)) {
            qnt++;
        }

        System.out.println("Quantidade iguais: " + qnt);
    }

    void getAtributos() {
        System.out.println("Numero " + numero);
        System.out.println("String " + string);
        System.out.println("Dooble " + dooble);
    }

}

/*Escreva uma classe genérica com 3 atributos de um mesmo tipo genérico. Além do
construtor, essa classe deve ter:
• Um método que diz quantos dos 3 atributos são iguais;
• Um método que imprime os 3 atributos.
Escreva também uma classe executável para demonstrar o uso da classe criada com
diferentes tipos de dados. */
