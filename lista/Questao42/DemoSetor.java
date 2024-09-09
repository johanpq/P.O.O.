package lista.Questao42;

public class DemoSetor {
    public static void main(String[] args) {
        Administrativo admin = new Administrativo("Johan", 3104.2, 21312, "Tarde", 122.0);
        Tecnico tec = new Tecnico("Pedro", 56.1, 234234, 10.0);

        System.out.println(admin);
        System.out.println(tec);
    }
}
