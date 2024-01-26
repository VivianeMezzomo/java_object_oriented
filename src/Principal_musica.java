public class Principal_musica {
    public static void main(String[] args) {
        /*Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes,
        e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.*/
        Musica novaMusica = new Musica();

        //Exibir a ficha técnica
        novaMusica.titulo = "Hello";
        novaMusica.artista = "Adele";
        novaMusica.anoDeLancamento = 2019;
        novaMusica.exibeFichaTecnica();

        //Avaliar a música
        novaMusica.avaliaMusica(8);
        novaMusica.avaliaMusica(9);
        novaMusica.avaliaMusica(10);
        System.out.println(novaMusica.avaliacao);

        //Calcular a média de avaliações
        System.out.println(novaMusica.calculaMedia());
    }
}
