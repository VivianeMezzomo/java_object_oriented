package br.com.alura.screenmatch.heritageAndInterface;

public class Servico extends Item{
    private int quantidadeHoras;
    public double calculaImposto() {
        //serviço tem 12% de imposto:
        return getPreco() * 0.12;
    }
}
