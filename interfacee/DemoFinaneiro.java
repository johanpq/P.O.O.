package interfacee;

public class DemoFinaneiro {
   public static void main(String[] args) {
        Fatura fatura = new Fatura(20.4, 5);
        EmpregadoAssalariado empregadoAssalariado = new EmpregadoAssalariado("Pedro", "asda", 23.2);

        imprimirPagamento(fatura);
        imprimirPagamento(empregadoAssalariado);
   }

   public static void imprimirPagamento(Pagavel pagavel) {
    System.out.println("Valor do pagamento: " + pagavel.valorDoPagamento());
   }
}
