package br.com.alura.screenmatch.bookChallenge;

public class Livro implements Calculavel{
    @Override
    public void calcularPrecoFinal(double preco) {
        double result = preco * 10;
        System.out.println("O preco final do livro é: " + result);
    }
}
