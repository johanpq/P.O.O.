package lista.questao24;

class Fatura {
    int id;
    String descricao;
    int qntComprada;
    double precoUnitario;

    Fatura(int id, String descricao, int qntComprada, double precoUnitario) {
        this.id = id;
        this.descricao = descricao;
        if(qntComprada < 0) {
            this.qntComprada = 0;
        } else {
            this.qntComprada = qntComprada;
        }

        if(precoUnitario <= 0) {
            this.precoUnitario = 0.0;
        } else {
            this.precoUnitario = precoUnitario;
        }
    }


    double calculaTotal() {
        return (qntComprada * precoUnitario);
    }
}

/*Crie uma classe chamada F atura para que uma loja de suprimentos de informática a
utilize para representar uma fatura de um item vendido. Uma Fatura deve incluir as seguintes informações sobre o item vendido: o número de identificação, a descrição, a
quantidade comprada e o preço unitário. Se a quantidade não for positiva, ela deve ser
configurada como 0. Se o preço por item não for positivo, ele deve ser configurado como
0.0. Forneça também um método chamado calculaTotal que calcula e retorna o valor de
fatura (isto é, multiplica a quantidade pelo preço por item). Escreva um aplicativo de teste
que demonstre as capacidades da classe criada. */