package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Calculadora;

public class Principal_calculadora {
    public static void main(String[] args) {
        /*Crie uma classe br.com.alura.screenmatch.modelos.Calculadora com um método que recebe um número como parâmetro e retorna o dobro desse número.*/
        Calculadora dobraValor = new Calculadora();
        System.out.println(dobraValor.calculaDobro(5));
    }
}
