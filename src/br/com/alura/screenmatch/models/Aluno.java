package br.com.alura.screenmatch.models;

public class Aluno {
    private String nome;
    private int idade;
    private double nota1;
    private double nota2;
    private double nota3;

    public void exibeInformacoesDoAluno(){
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Idade do aluno: " + idade);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public String getNome() {
        return nome;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public double calculaMedia(){
        return (nota1 + nota2 + nota3) / 3;
    }
}
