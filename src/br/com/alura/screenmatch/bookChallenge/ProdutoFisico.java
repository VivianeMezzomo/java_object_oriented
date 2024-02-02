package br.com.alura.screenmatch.bookChallenge;

public class ProdutoFisico implements Calculavel{
    public void calcularPrecoFinal(double preco) {
        double result = preco * 20;
        System.out.println("O preco final do produto físico é: " + result);
    }
}
