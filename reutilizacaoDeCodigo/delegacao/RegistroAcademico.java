package reutilizacaoDeCodigo.delegacao;

public class RegistroAcademico {
    private String nomeDoAluno;
    private int matricula;
    private String curso;

    RegistroAcademico(String nomeDoAluno, int matricula, String curso) {
        this.nomeDoAluno = nomeDoAluno;
        this.matricula = matricula;
        this.curso = curso;
    }


    public String toString() {
        return "Nome: " + nomeDoAluno + "; matricula: " + matricula + "; curso: " + curso;
    }
}
