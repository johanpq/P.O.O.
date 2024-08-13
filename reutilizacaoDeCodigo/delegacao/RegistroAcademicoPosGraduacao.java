package reutilizacaoDeCodigo.delegacao;

public class RegistroAcademicoPosGraduacao {
    private RegistroAcademico gradInfo; // Isso se chama delegação
    private String tituloTese;
    private String orientador;

    /* Recebe os dados já feitos em objeteos */
    RegistroAcademicoPosGraduacao(RegistroAcademico gradInfo, String tituloTese, String orientador) {
        this.gradInfo = gradInfo;
        this.tituloTese = tituloTese;
        this.orientador = orientador;
    } 

    /* Ou eu crio já diretamente aqui */

    // ! Pode escolher uma das formas

    RegistroAcademicoPosGraduacao(String nomeDoAluno, int matricula, String curso, String tituloTese, String orientador) {
        this.gradInfo = new RegistroAcademico(nomeDoAluno, matricula, curso); 
        this.tituloTese = tituloTese;
        this.orientador = orientador;
    } 


    public String toString() {
        return gradInfo.toString() + "tese " + tituloTese + "; orientador: " + orientador;
    }

}
