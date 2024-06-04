package basic.aula3;
import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        /*        
        int dia;
        int mes;
        int ano; */
        String dataFormatada;
        int qntDias;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Dia: ");
        int dia = entrada.nextInt();

        System.out.print("Mes: ");
        int mes = entrada.nextInt();

        System.out.print("Ano: ");
        int ano = entrada.nextInt();

        dataFormatada = dia + " de ";

        if(mes == 1) {
            dataFormatada += "Janeiro";
        } else if(mes == 2) {
            dataFormatada += "Fevereiro";
        } else if(mes == 3) {
            dataFormatada += "Março";
        } else if(mes == 4) {
            dataFormatada += "Abril";
        } else if(mes == 5) {
            dataFormatada += "Maio";
        } else if(mes == 6) {
            dataFormatada += "Junho";
        } else if(mes == 7) {
            dataFormatada += "Julho";
        } else if(mes == 8) {
            dataFormatada += "Agosto";
        } else if(mes == 9) {
            dataFormatada += "Setembro";
        } else if(mes == 10) {
            dataFormatada += "Outubro";
        } else if(mes == 11) {
            dataFormatada += "Novembro";
        } else {
            dataFormatada += "Dezembro";
        }

        dataFormatada+= " de " + ano;

        System.out.println(dataFormatada);

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                qntDias = 31;
                break;
            case 2:
                qntDias = 28;
        
            default:
                qntDias = 30;
                break;
        }

        System.out.println("O mes da data informada tem " + qntDias);

        entrada.close();
    }
}
