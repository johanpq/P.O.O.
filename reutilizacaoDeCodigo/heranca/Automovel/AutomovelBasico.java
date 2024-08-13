package reutilizacaoDeCodigo.heranca.Automovel;

public class AutomovelBasico extends Automovel {
    protected boolean airbag;
    protected boolean radio;

    AutomovelBasico(int ano, String modelo, String cor) {
        super(ano, modelo, cor);
        this.airbag = airbag;
        this.radio = radio;
    }

    public double quantoCusta() {
        double custo = super.quantoCusta();
        if(airbag) {
            custo += 10.000;
        }
        if(radio) {
            custo += 2.500;
        }

        return custo;
    }
}
