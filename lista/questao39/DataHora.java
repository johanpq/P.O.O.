package lista.questao39;

public class DataHora {
    private int dia, mes, ano;
    private int hora, minuto;


    public DataHora(int dia, int mes, int ano, int hora, int minuto) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.hora = hora;
        this.minuto = minuto;
    }

    public String getData() {
        String data = "";
        data += dia + "/" + mes + "/" + ano;
        return data;
    }

    public String getTime() {
        String time = "";
        time += hora + ":" + minuto;
        return time;
    }

    public String toString() {
        String res = "";
        res += dia + "/" + mes + "/" + ano + "\n";
        res += hora + ":" + minuto;
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