package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.models.ContaBancaria;

import java.util.Scanner;

public class Principal_ContaBancaria {
    public static void main(String[] args) {
        /*Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), saldo (privado) e titular (publico).
        Implemente métodos getters e setters para os atributos privados.*/

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o nome do titular: ");
        String titular = leitura.nextLine();

        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.setTitular(titular);

        contaBancaria.setNumeroConta(32047203);
        contaBancaria.setSaldo(90.87);

        System.out.println(contaBancaria.getNumeroConta());
        System.out.println(contaBancaria.getSaldo());
    }
}
