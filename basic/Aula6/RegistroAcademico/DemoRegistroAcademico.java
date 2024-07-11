package basic.Aula6.RegistroAcademico;

public class DemoRegistroAcademico {
    public static void main(String[] args) {
        RegistroAcademico michael = new RegistroAcademico();

        michael.inicializaRegistroAcademico("Michael", "ksdao23", 2, 0.7);

        double mensalidade = michael.calculaMensalidade();

        System.out.print("A mensalidade de Michael eh: " + mensalidade);

        RegistroAcademico roberto = new RegistroAcademico(); // Sem ser inicializada, será imprimido os valores normais das variáveis

        System.out.print("A mensalidade de Roberto eh: " + roberto.calculaMensalidade());
    }
}
