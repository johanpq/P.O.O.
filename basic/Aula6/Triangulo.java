package basic.Aula6;

class Triangulo {
    double lado1, lado2, lado3;
    String descricao;


    void inicializar(double lado1, double lado2, double lado3, String descricao) {
        lado1 = lado1;
        lado2 = lado2;
        lado3= lado3;
        descricao = descricao;
    }

    double perimetro() {
        return (lado1 + lado2 + lado3);
    }
}
