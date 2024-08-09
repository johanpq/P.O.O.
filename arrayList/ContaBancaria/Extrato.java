package arrayList.ContaBancaria;

import java.util.ArrayList;

public class Extrato {
    private double saldoFinal;
    private ArrayList<Double> transacoes;

    public Extrato() {
        saldoFinal = 0.0;
        transacoes = new ArrayList<>(); // Cria uma ArrayList vazia, é opcional coloca o tipo, por isso pode fica: <>
    }

    public void transacao(double valor) {
        if(saldoFinal + valor >= 0) {
            saldoFinal += valor;
            transacoes.add(valor); // * Atualiza o valor no ArrayList
            // Está fazendo autoboxing, porque um objeto(que é Double) recebe o valor do tipo double, então acaba criando um novo ArrayList.
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void vizualizar() {
        System.out.println("=============");

        // Pode acessar desta forma a arraylist
/*         for (Double d : transacoes) {
            System.out.println("Lista de transacoes: " + d);
        } */

        // Ou desta
        for(int i = 0; i < transacoes.size(); i++) {
            System.out.println(i + "" + transacoes.get(i)); // Método get -> Pega o elemento
        }

        System.out.println("Saldo: " + saldoFinal);
        System.out.println("=============");

    }
}
