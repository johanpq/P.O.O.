package lista.questao25;
import java.util.Scanner;

class Alunos {
    int matricula;
    String nome;
    double p1, p2, notaTrabalho;

    Alunos(int matricula, String nome, double p1, double p2, double notaTrabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
        this.notaTrabalho = notaTrabalho;
    }

    double media() {
        return (((2.5 * p1) + (2.5 * p2) + (2 * notaTrabalho)) / 7);
    }

    double provaFinal() {
        double pickMedia = media();
        double exameFinal;
        Scanner input = new Scanner(System.in);

        if(pickMedia < 3 || pickMedia >= 7) {
            return 0;
        }

        System.out.print("Infome a nota do exame final: ");
        exameFinal = input.nextDouble();

        double mediaFinal = ((pickMedia * 6) + (exameFinal * 4)) / 10;

        input.close();

        return mediaFinal;
    }
}


/*Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina da
Ufersa. Cada objeto dessa classe deve guardar os seguintes dados do aluno: matrícula,
nome, 2 notas de prova (P1 e P2) e 1 nota de trabalho (T). Escreva os seguintes métodos
para esta classe:
• media: calcula a média parcial do aluno (MP)
– cada prova tem peso 2,5 e o trabalho tem peso 2 (MP =
2,5×P1+2,5×P2+2×T
7
)
• provaF inal: calcula quanto o aluno precisa para o exame final (EF)
– retorna zero se o aluno não necessita realizar o exame final (MP < 3 ou MP >=
7)
– média final MF = (MP × 6 + EF × 4)/10
– é necessário que MF seja maior ou igual a 5 para que o aluno seja aprovado
após realizar o exame final
Escreva um aplicativo de teste que demonstre as capacidades da classe criada. */