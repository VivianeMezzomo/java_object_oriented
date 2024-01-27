package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Carro;

import java.util.Calendar;

public class Principal_carro {
    public static void main(String[] args){
        /*Crie uma classe br.com.alura.screenmatch.modelos.Carro com atributos modelo, ano, cor
         e métodos para exibir a ficha técnica e calcular a idade do carro.*/
        Carro novoCarro = new Carro();

        //Exibe a ficha técnica
        novoCarro.setModelo("Yaris");
        novoCarro.setAno(2020);
        novoCarro.setCor("Prata");

        novoCarro.exibeFichaTecnica();

        //Calcula a idade do carro
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        System.out.println(novoCarro.idadeDoCarro(year));
    }
}
