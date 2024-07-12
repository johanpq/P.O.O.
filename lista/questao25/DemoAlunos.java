package lista.questao25;
import java.util.Scanner;

public class DemoAlunos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matricula;
        String nome;
        double p1, p2, notaTrabalho;

        System.out.print("Informe o seu nome: ");
        nome = input.nextLine();

        System.out.print("Informe a sua matricula: ");
        matricula = input.nextInt();

        System.out.print("Informe a nota da prova 1: ");
        p1 = input.nextDouble();

        System.out.print("Informe a nota da prova 2: ");
        p2 = input.nextDouble();

        System.out.print("Informe a nota do trabalho: ");
        notaTrabalho = input.nextDouble();

        Alunos myAlunos = new Alunos(matricula, nome, p1, p2, notaTrabalho);

        double myMedia = myAlunos.media();
        double mediaFinal = myAlunos.provaFinal();

        if(mediaFinal < 5) {
            System.out.println("Voce foi reprovado! Sua media foi " + mediaFinal);
        } else if(myMedia >= 7) {
            System.out.println("Voce foi aprovado! Sua media foi " + myMedia);
        }

        if(mediaFinal == 0) {
            System.out.println("Voce nao precisa fazer a prova final!");
        } else if(mediaFinal >= 5) {
            System.out.println("Voce foi aprovado com media final " + mediaFinal);
        }

        input.close();
    }
}
