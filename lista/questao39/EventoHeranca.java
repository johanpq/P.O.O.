package lista.questao39;

public class EventoHeranca extends DataHora {
    private String evento;

    public EventoHeranca(int dia, int mes, int ano, int hora, int minuto, String evento) {
        super(dia, mes, ano, hora, minuto);
        this.evento = evento;
    }

    public String getEvento() {
        return evento;
    }

    public String toString() {
        String res = "";
        String getData = getData();
        String getTime = getTime();
        String getEvento = getEvento();

        res += getData + "\n";
        res += getTime + "\n";
        res += getEvento;
        return res;
    }
}
/*Crie uma classe para representar uma data e um horário (DataHora).
• Escreva uma classe EventoDelegacao que seja baseada na classe DataHora e que
contenha um campo para indicar qual o evento que ela representa (use uma String
para isto). Use o mecanismo de delegação para criar a classe EventoDelegacao;
• Escreva uma classe EventoHeranca que seja baseada na classe DataHora e que
contenha um campo para indicar qual o evento que ela representa (use uma String
para isto). Use o mecanismo de herança para criar a classe EventoHeranca;
• Escreva um aplicativo de teste que demonstre o uso das classes criadas. */
