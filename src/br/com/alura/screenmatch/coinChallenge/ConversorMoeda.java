package br.com.alura.screenmatch.coinChallenge;

public class ConversorMoeda implements ConversaoFinanceira {
    private double valorDeConversao;

    public void setValorDeConversao(double valorDeConversao) {
        this.valorDeConversao = valorDeConversao;
    }

    @Override
    public void converterDolarParaReal(double valorDolar) {
        double valorEmReal = valorDolar * valorDeConversao;
        System.out.println("O valor em real é: " + valorEmReal);
    }
}
