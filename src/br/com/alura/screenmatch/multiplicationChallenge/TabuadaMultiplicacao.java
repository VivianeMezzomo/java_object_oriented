package br.com.alura.screenmatch.multiplicationChallenge;

public class TabuadaMultiplicacao implements Tabuada{

    @Override
    public void mostrarTabuada(int numero) {
        for (int i = 1; i <= 10; i++){
            System.out.println(i + " X " + numero + " = " + (i * numero));
        }
    }
}
