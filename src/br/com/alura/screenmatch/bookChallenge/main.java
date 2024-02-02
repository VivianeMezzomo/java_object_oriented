package br.com.alura.screenmatch.bookChallenge;

public class main {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.calcularPrecoFinal(10.00);

        ProdutoFisico produtoFisico = new ProdutoFisico();
        produtoFisico.calcularPrecoFinal(20.00);
    }
}
