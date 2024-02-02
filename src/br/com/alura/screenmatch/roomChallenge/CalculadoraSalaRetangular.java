package br.com.alura.screenmatch.roomChallenge;

public class CalculadoraSalaRetangular implements CalculoGeometrico {

    @Override
    public void calcularArea(double altura, double largura) {
        double area = altura * largura;
        System.out.println("A área é igual a: " + area);
    }

    @Override
    public void calcularPerimetro(double altura, double largura) {
        double perimetro = 2 * (altura + largura);
        System.out.println("O perímetro é igual a: " + perimetro);
    }
}
