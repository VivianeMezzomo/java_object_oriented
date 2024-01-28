package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.models.Produto;

public class Principal_produto {
    /*Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize métodos getters e setters para acessar e modificar esses atributos.
    Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.*/
    public static void main(String[] args) {
        Produto novoProduto = new Produto();

        novoProduto.setNome("Caderno");
        novoProduto.setPreco(30.00);

        System.out.println("Produto: " + novoProduto.getNome());
        System.out.println("Preço: " + novoProduto.getPreco());

        double produtoComDesconto = novoProduto.calculaPercentual(10.00);
        System.out.println("Valor com desconto dee 10%: " + produtoComDesconto);
    }
}
