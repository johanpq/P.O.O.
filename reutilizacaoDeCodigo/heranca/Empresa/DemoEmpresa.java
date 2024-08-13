package reutilizacaoDeCodigo.heranca.Empresa;

public class DemoEmpresa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Johan", "0123123");
        System.out.println(pessoa);

        Funcionario funcionario = new Funcionario("Pedro", "12312", 45.6);
        System.out.println(funcionario);

        ChefeDeDepartamento chefe = new ChefeDeDepartamento("Queiroz", "213123", 10.000, "T.I.");
        System.out.println(chefe);

        System.out.println(pessoa.getNome());
        System.out.println(funcionario.getSalario());
        System.out.println(chefe.getDepartamento());
    }

}
