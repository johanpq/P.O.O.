package basic.aula3;
import java.util.Scanner;
import java.util.Calendar;

public class ValidaCartao {
    public static void main(String[] args) {
        String nome, numero, codigo;
        int mes, ano;

        int mesAtual, anoAtual;

        boolean expirado = true;

        Calendar calendar = Calendar.getInstance();

        anoAtual = calendar.get(Calendar.YEAR);
        mesAtual = calendar.get(Calendar.MONTH) + 1; // Calendar.MONTH é zero-based, por isso adicionamos 1

        Scanner input = new Scanner(System.in);

        System.out.print("Nome: ");
        nome = input.nextLine();

        System.out.print("Numero do cartao: ");
        numero = input.nextLine();

        System.out.print("Codigo: ");
        codigo = input.nextLine();

        do {
            System.out.print("Mes da validade: ");
            mes = input.nextInt();
    
            System.out.print("Ano da validade: ");
            ano = input.nextInt();

            expirado = (ano < anoAtual) || (ano == anoAtual && mes < mesAtual);

            if(expirado) {
                System.out.print("Expirado! Tente novamente.\n");
            }
        } while(expirado);

        System.out.print("Cartao validado com sucesso!\n");
        
        System.out.printf("Nome: %s%nNumero do cartao: %s%nCodigo: %s%nMes da validade: %d%nAno da validade: %d%n", nome, numero, codigo, mes, ano);

        
        System.out.printf("Mes e ano atual: %d/%d%n", mesAtual, anoAtual);

        input.close();
    }
}
