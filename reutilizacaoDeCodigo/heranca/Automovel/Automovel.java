package reutilizacaoDeCodigo.heranca.Automovel;

public class Automovel {
    protected int ano;
    protected String modelo;
    protected String cor;



    public Automovel(int ano, String modelo, String cor) {
        this.ano = ano;
        this.modelo = modelo;
        this.cor = cor;
    }


    public double quantoCusta() {
        return (ano < 2010 ? 20.000 : 40.000);
    }
    
}
