package br.com.alura.screenmatch.carChallenge;

public class main {
    public static void main(String[] args) {
        /* Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos.
        Implemente métodos para definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o menor e o maior preço.
        Adicione uma subclasse ModeloCarro para criar instâncias específicas, utilizando-a na classe principal para definir preços e mostrar informações.*/

        Car car = new Car();
        car.defineCarModel("Yaris");
        car.defineCarPrice(100000.00, 115000.99, 130000.87);
        car.showInfo();

    }
}
