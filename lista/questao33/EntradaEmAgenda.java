package lista.questao33;

public class EntradaEmAgenda {
    private int dia, mes, ano;
    private String hora, assunto;


    EntradaEmAgenda(String hora, int dia, int mes, int ano, String assunto) {
        this.hora = hora;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.assunto = assunto;
    }

    boolean ehNoDia(int diaUser, int mesUser, int anoUser) {
        return (dia == diaUser && mes == mesUser && ano == anoUser) ? true : false;
    }

    public String toString() {
        return dia + "/" + mes + "/" + ano + " sobre: " + assunto + " as: " + hora;
    }
}


/*Crie uma classe EntradaEmAgenda que contenha:
• os dados necessários para armazenar uma entrada de agenda (hora, dia, mês, ano
e assunto);
• um construtor;
• um método toString;
• um método ehNoDia que recebe valores de dia, mês e ano e retorna true se o dia,
mês e ano daquela instância da classe forem iguais aos argumentos passados.
Crie também uma classe Agenda que:
• encapsule uma agenda de compromissos representada por um ArrayList de instâncias da classe EntradaEmAgenda;
– este item é obrigatório. Caso não seja contemplado, toda a questão será desconsiderada
• implemente um método construtor;
• possua um método para adicionar um novo compromisso à lista de compromissos;
• tenha um método listaDia que recebe valores de dia, mês e ano e lista todas as
instâncias de EntradaEmAgenda que caem naquele dia, mês e ano.
Por fim, escreva uma classe executável que crie uma Agenda, adicione a ela 5 compromissos e, usando o método listaDia, liste as entradas da agenda que tem a mesma da
data do seu aniversário. */