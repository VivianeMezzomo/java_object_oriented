package br.com.alura.screenmatch.coinChallenge;

public class main {
    public static void main(String[] args) {
        ConversorMoeda conversorMoeda = new ConversorMoeda();
        conversorMoeda.setValorDeConversao(4.92);
        conversorMoeda.converterDolarParaReal(30.00);
    }
}
