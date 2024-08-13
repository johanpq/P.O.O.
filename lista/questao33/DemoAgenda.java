package lista.questao33;

public class DemoAgenda {
    public static void main(String[] args) {
        Agenda myAgenda = new Agenda();

        myAgenda.novoCompromisso("18:00", 5, 5, 2012, "Sei lá");

        myAgenda.listaDia(20, 40, 50);
        
    }
}
