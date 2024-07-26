package lista.questao31;

public class RegistroAcademico {
    private static int numeroDeMatriculas = 0;

    RegistroAcademico() {
        inicializa();
    }

    void inicializa() {
        numeroDeMatriculas++;
    }

    int getNumeroDeMatriculas() {
        return numeroDeMatriculas;
    }
    
}

/*Escreva uma versão da classe RegistroAcademico (vista em aula) que tenha o campo
numeroDeMatriculas declarado como static, e que incremente o valor deste campo cada
vez que uma instância da classe for criada. Use o atributo numeroDeMatriculas para
definir o atributo matricula automaticamente com um valor diferente para cada instância.
Escreva também uma aplicação que crie algumas instâncias da classe para demonstrar
seu funcionamento */