package lista.questao46;

public class Demo {
   public static void main(String[] args) {
        FiguraGeometrica circulo = new Circulo();
        FiguraGeometrica quadrado = new Quadrado();
        FiguraGeometrica triangulo = new Triangulo();

        circulo.descricao();
        quadrado.descricao();
        triangulo.descricao();


        Desenho myDesenho1 = new Desenho(circulo, quadrado, 5, 1, 7, 7);
        Desenho myDesenho2 = new Desenho(quadrado, triangulo, 1, 0, 8, 4);

        myDesenho1.apresenta();
        myDesenho2.apresenta();
   }
}
/*Crie uma classe Desenho que possui dois atributos do tipo FiguraGeometrica (criado na
questão anterior) e suas respectivas coordenadas em um plano bidimensional. Escreva
um construtor para a classe Desenho que inicialize todos os atributos através dos parâmetros. Implemente também o método apresenta() que, para cada FiguraGeometrica
em um Desenho, informa suas coordenadas e imprime sua descrição. Por fim, crie uma
classe executável, Principal, que cria dois objetos do tipo Desenho e chama seu meu método apresenta. O primeiro Desenho deve ser formado por um Circulo e um Quadrado e
o segundo por um Quadrado e um Triangulo.*/
