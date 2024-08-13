package reutilizacaoDeCodigo.heranca.Automovel;

public class AutomovelDeLuxo extends AutomovelBasico {
    private boolean arCondicionado;
    private boolean direcaoHidraulica;


    public AutomovelDeLuxo(int ano, String modelo, String cor, boolean airbag, boolean radio, boolean arCondicionado, boolean direcaoHidraulica) {
        super(ano, modelo, cor);
        this.arCondicionado = arCondicionado;
        this.direcaoHidraulica = direcaoHidraulica;
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

    public String toString() {
        String res = "";
        res += "Ano: " + ano + "\n";
        res += "Modelo: " + modelo + "\n";
        res += "Cor: " + cor + "\n";
        res += "Airbag: " + airbag + "\n";
        res += "Radio: " + radio + "\n";
        res += "Ar Condicionado: " + airbag + "\n";
        res += "Direcao hidraulica: " + direcaoHidraulica + "\n";
        return res;
    }
}
