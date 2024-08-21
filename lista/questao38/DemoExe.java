package lista.questao38;

public class DemoExe {
    public static void main(String[] args) {
        Equipamento equipamento1 = new Equipamento("A1", "AA1");
        String getMouse = equipamento1.getMouse();

        System.out.println(getMouse);

        equipamento1.setMouse("A01");
        System.out.println(equipamento1);

        getMouse = equipamento1.getMouse();

        System.out.println(getMouse);

        System.out.println("======================");

        Computador computador1 = new Computador("asd","sad" ,"fdg", "fdgd");
        System.out.println(computador1);

        String getMouseFromComputador = computador1.getMouse(); // Pega o mouse criado na classe computador usando o metodo da classe equipamento

        System.out.println(getMouseFromComputador);
    }   
}
