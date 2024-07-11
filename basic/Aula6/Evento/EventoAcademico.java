package basic.Aula6.Evento;

class EventoAcademico {
    String nomeDoEvento;
    String localDoEvento;
    int numeroDeParticipantes;

    // Construtor (Quando for chamado, será inicializado automaticamente)
    EventoAcademico(String nomeDoEvento, String localDoEvento, int numeroDeParticipantes) {
        this.nomeDoEvento = nomeDoEvento;
        this.localDoEvento = localDoEvento;
        this.numeroDeParticipantes = numeroDeParticipantes;
    }
     
    void mostraEvento() {
        System.out.println("Nome: " + nomeDoEvento);
        System.out.println("Local: " + localDoEvento);
        System.out.println("Participantes: " + numeroDeParticipantes);
    }
}
