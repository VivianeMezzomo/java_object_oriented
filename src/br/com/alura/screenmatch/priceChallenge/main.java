package br.com.alura.screenmatch.priceChallenge;

import br.com.alura.screenmatch.bookChallenge.ProdutoFisico;

public class main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setPrecoUnitario(25.90);
        produto.aplicarDesconto(10);
        System.out.println(produto.calcularPrecoTotal(5));

        Servico servico = new Servico();
        servico.setPrecoHora(60);
        servico.aplicarDesconto(20);
        System.out.println(servico.calcularPrecoTotal(2));
    }
}
