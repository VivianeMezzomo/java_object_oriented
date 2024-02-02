package br.com.alura.screenmatch.finalChallenge;

public class Audio {
    private String titulo;
    private int totalReproducoes;
    private int curtidas;
    private int classificacao;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curte(){
        this.curtidas++;
    }

    public void reproduz(){
        this.totalReproducoes++;
    }
}
