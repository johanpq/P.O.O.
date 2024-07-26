package lista.questao31;

public class DemoRegistro {
    public static void main(String[] args) {
        RegistroAcademico teste1 =  new RegistroAcademico();

        int getNumeroDeMatricula = teste1.getNumeroDeMatriculas();

        System.out.println(getNumeroDeMatricula);

        RegistroAcademico teste2 = new RegistroAcademico();

        getNumeroDeMatricula = teste2.getNumeroDeMatriculas();

        System.out.println(getNumeroDeMatricula);
    }
}
