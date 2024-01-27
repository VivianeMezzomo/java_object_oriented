package br.com.alura.screenmatch.modelos;

public class Carro {
    private String modelo;
    private int ano;
    private String cor;

    public void exibeFichaTecnica(){
        System.out.println("Modelo do carro: " + modelo);
        System.out.println("Ano do carro: " + ano);
        System.out.println("Cor do carro: " + cor);
    }

    public int idadeDoCarro(int anoAtual){
        return anoAtual - ano;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
