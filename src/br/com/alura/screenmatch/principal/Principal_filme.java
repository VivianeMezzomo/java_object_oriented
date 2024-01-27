package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;

public class Principal_filme {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNomeDoFilme("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(9);
        System.out.println(meuFilme.getSomaDasAvaliacoes());
        System.out.println(meuFilme.getTotalDeAvaliacoes());

        System.out.println(meuFilme.retornaMedia());
    }
}
