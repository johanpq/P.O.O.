package basic.Aula6.RegistroAcademico;

class RegistroAcademico {
    String nome; // sem ser inicializado é null
    String matricula;// sem ser inicializado é null
    int codigoCurso; // sem ser inicializado é 0
    double percentualDeCobranca; // Bolsa(tipo um desconto da mensalidade)     // sem ser inicializado é 0


    void inicializaRegistroAcademico(String n, String m, int c, double p) {
        nome = n;
        matricula = m;
        codigoCurso = c;
        percentualDeCobranca = p;
    }

    
    double calculaMensalidade() {
        return 100 * codigoCurso * percentualDeCobranca;
    }
}
