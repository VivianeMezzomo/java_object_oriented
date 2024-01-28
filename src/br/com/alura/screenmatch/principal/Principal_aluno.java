package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.models.Aluno;

public class Principal_aluno {
    public static void main(String[] args) {
        /*Crie uma classe br.com.alura.screenmatch.modelos.Aluno com atributos nome, idade, e um método para exibir informações.
        Crie uma instância da classe br.com.alura.screenmatch.modelos.Aluno, atribua valores aos seus atributos e utilize o método para exibir as informações.*/
        Aluno novoAluno = new Aluno();

        novoAluno.setNome("Viviane");
        novoAluno.setIdade(20);
        novoAluno.exibeInformacoesDoAluno();

        /*Desenvolva uma classe Aluno com os atributos privados nome e notas. Utilize métodos getters e setters para acessar e modificar esses atributos.
        Adicione um método calcularMedia que retorna a média das notas do aluno.*/

        novoAluno.setNota1(10.0);
        novoAluno.setNota2(8.5);
        novoAluno.setNota3(6.8);
        System.out.println("Aluno: " + novoAluno.getNome());
        System.out.println("Nota 1: " + novoAluno.getNota2());
        System.out.println("Nota 2: " + novoAluno.getNota1());
        System.out.println("Nota 3: " + novoAluno.getNota3());
        System.out.println("Média: " + novoAluno.calculaMedia());
    }
}
