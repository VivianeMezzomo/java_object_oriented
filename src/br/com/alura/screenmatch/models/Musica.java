package br.com.alura.screenmatch.models;

public class Musica {
    private String titulo;
    private String artista;
    private int anoDeLancamento;
    private double avaliacao;
    private int numeroAvaliacoes;

    public void exibeFichaTecnica(){
        System.out.println("Título da música: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    public void avaliaMusica(double nota){
        avaliacao += nota;
        numeroAvaliacoes++;
    }

    public double calculaMedia(){
        return avaliacao / numeroAvaliacoes;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public double getAvaliacao() {
        return avaliacao;
    }
}
