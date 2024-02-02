package br.com.alura.screenmatch.heritageAndInterface;

public class Produto extends Item {
    private double peso;
    public double calculaImposto() {
        //produto tem 10% de imposto:
        return getPreco() * 0.1;
    }
}
