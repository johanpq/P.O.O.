package lista.questao39;

public class DemoDataHora {
    public static void main(String[] args) {
        DataHora dataHora = new DataHora(8, 5, 2003, 19, 20);
        System.out.println(dataHora);

        System.out.println("==================");

        EventoDelegacao eventoDele = new EventoDelegacao(1, 2, 2004, 9, 5, "Campeonato de karate");
        System.out.println(eventoDele);

        System.out.println("==================");

        EventoHeranca eventoHeranca = new EventoHeranca(3, 9, 2024, 15, 16, "I'll be honest");
        System.out.println(eventoHeranca);
    }
}
