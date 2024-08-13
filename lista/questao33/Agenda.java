package lista.questao33;

import java.util.ArrayList;

public class Agenda {
    private EntradaEmAgenda myAgenda;
    private ArrayList<EntradaEmAgenda>agenda; //ArrayList do tipo EntradaEmAgenda


    Agenda() {
        agenda = new ArrayList<>();
    }

    void novoCompromisso(String hora, int dia, int mes, int ano, String assunto) {
        myAgenda = new EntradaEmAgenda(hora, dia, mes, ano, assunto);
        agenda.add(myAgenda);
    }

    void listaDia(int dia, int mes, int ano) {
        // Itera sobre toda a agenda
        for (EntradaEmAgenda i : agenda) {
            if(i.ehNoDia(dia, mes, ano)) { 
                System.out.printf(i.toString());
            } else {
                System.out.println("Nenhum compromisso para os dias " + dia + "/" + mes + "ano");
            }
        }
    }
}
