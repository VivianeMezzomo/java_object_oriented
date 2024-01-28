package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.IdadePessoa;

public class Principal_idadePessoa {

    public static void main(String[] args) {
         /*Crie uma classe idadePessoa com os atributos privados nome e idade.
         Utilize métodos getters e setters para acessar e modificar esses atributos.
         Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.*/

        IdadePessoa idadeDaPessoa = new IdadePessoa();
        idadeDaPessoa.setNome("Viviane");
        idadeDaPessoa.setIdade(20);

        System.out.println(idadeDaPessoa.getNome());
        System.out.println(idadeDaPessoa.getIdade());

        idadeDaPessoa.verificarIdade();
    }
}
