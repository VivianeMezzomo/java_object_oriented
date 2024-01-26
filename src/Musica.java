public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double avaliacao;
    int numeroAvaliacoes;

    void exibeFichaTecnica(){
        System.out.println("Título da música: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    void avaliaMusica(double nota){
        avaliacao += nota;
        numeroAvaliacoes++;
    }

    double calculaMedia(){
        return avaliacao / numeroAvaliacoes;
    }
}
