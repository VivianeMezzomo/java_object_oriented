package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Musica;

public class Principal_musica {
    public static void main(String[] args) {
        /*Crie uma classe br.com.alura.screenmatch.modelos.Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes,
        e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.*/
        Musica novaMusica = new Musica();

        //Exibir a ficha técnica
        novaMusica.setTitulo("Hello");
        novaMusica.setArtista("Adele");
        novaMusica.setAnoDeLancamento(2019);
        novaMusica.exibeFichaTecnica();

        //Avaliar a música
        novaMusica.avaliaMusica(8);
        novaMusica.avaliaMusica(9);
        novaMusica.avaliaMusica(10);
        System.out.println(novaMusica.getAvaliacao());

        //Calcular a média de avaliações
        System.out.println(novaMusica.calculaMedia());
    }
}
