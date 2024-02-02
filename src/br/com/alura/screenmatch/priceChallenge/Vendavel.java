package br.com.alura.screenmatch.priceChallenge;

public interface Vendavel {
    double calcularPrecoTotal(int quantidade);
    void aplicarDesconto(double percentualDesconto);
}
