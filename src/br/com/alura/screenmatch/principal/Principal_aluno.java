package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Aluno;

public class Principal_aluno {
    public static void main(String[] args) {
        /*Crie uma classe br.com.alura.screenmatch.modelos.Aluno com atributos nome, idade, e um método para exibir informações.
        Crie uma instância da classe br.com.alura.screenmatch.modelos.Aluno, atribua valores aos seus atributos e utilize o método para exibir as informações.*/
        Aluno novoAluno = new Aluno();

        novoAluno.setNome("Viviane");
        novoAluno.setIdade(20);
        novoAluno.exibeInformacoesDoAluno();
    }
}
