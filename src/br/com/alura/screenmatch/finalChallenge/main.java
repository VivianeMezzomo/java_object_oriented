package br.com.alura.screenmatch.finalChallenge;

public class main {
    public static void main(String[] args) {
        Musicas musicas = new Musicas();
        musicas.setTitulo("Forever");
        musicas.setArtista("Kiss");

        for(int i = 0; i < 1000; i++){
            musicas.reproduz();
        }

        for(int i = 0; i < 50; i++){
            musicas.curte();
        }

        Podcasts podcasts = new Podcasts();
        podcasts.setTitulo("BolhaDev");
        podcasts.setHost("Marcos");

        for(int i = 0; i < 5000; i++){
            podcasts.reproduz();
        }

        for(int i = 0; i < 1000; i++){
            podcasts.curte();
        }

        MinhasMusicas minhasMusicas = new MinhasMusicas();
        minhasMusicas.inclui(podcasts);
        minhasMusicas.inclui(musicas);
    }
}
