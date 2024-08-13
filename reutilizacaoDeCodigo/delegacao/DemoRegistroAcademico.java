package reutilizacaoDeCodigo.delegacao;

public class DemoRegistroAcademico {
    public static void main(String[] args) {
        RegistroAcademico aluno = new RegistroAcademico("Johan", 20220123, "T.I.");
        System.out.println(aluno);

        // Primeira forma passa o objeto aluno
        RegistroAcademicoPosGraduacao alunoPos = new RegistroAcademicoPosGraduacao(aluno, "asda", "Prof f");

        System.out.println(alunoPos.toString());

        // Segunda forma cria aluno normal e aluno de pos tudo em uma class só
        RegistroAcademicoPosGraduacao alunosPos2 = new RegistroAcademicoPosGraduacao("ADa", 32423, "TI", "Seila", "Prof a");

        System.out.println(alunosPos2.toString());
    }
}
