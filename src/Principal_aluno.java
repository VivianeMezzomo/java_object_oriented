public class Principal_aluno {
    public static void main(String[] args) {
        /*Crie uma classe Aluno com atributos nome, idade, e um método para exibir informações.
        Crie uma instância da classe Aluno, atribua valores aos seus atributos e utilize o método para exibir as informações.*/
        Aluno novoAluno = new Aluno();

        novoAluno.nome = "Viviane";
        novoAluno.idade = 20;
        novoAluno.exibeInformacoesDoAluno();
    }
}
