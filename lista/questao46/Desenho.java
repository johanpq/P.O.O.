package lista.questao46;

public class Desenho {
    FiguraGeometrica figura1;
    FiguraGeometrica figura2;
    int x1, x2;
    int y1, y2;


    public Desenho(FiguraGeometrica figura1, FiguraGeometrica figura2, int x1,  int y1, int x2, int y2) {
        this.figura1 = figura1;
        this.figura2 = figura2;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void apresenta() {
        System.out.println("A figura 1 eh: " + figura1 + " em " + "(" + x1 + ", " + y1 + ")");
        System.out.println("A figura 2 eh: " + figura2 + " em " + "(" + x2 + ", " + y2 + ")");
        
    }
}
/*Crie uma classe Desenho que possui dois atributos do tipo FiguraGeometrica (criado na
questão anterior) e suas respectivas coordenadas em um plano bidimensional. Escreva
um construtor para a classe Desenho que inicialize todos os atributos através dos parâmetros. Implemente também o método apresenta() que, para cada FiguraGeometrica
em um Desenho, informa suas coordenadas e imprime sua descrição. Por fim, crie uma
classe executável, Principal, que cria dois objetos do tipo Desenho e chama seu meu método apresenta. O primeiro Desenho deve ser formado por um Circulo e um Quadrado e
o segundo por um Quadrado e um Triangulo.*/