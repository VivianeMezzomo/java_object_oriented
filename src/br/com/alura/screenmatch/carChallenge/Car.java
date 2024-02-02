package br.com.alura.screenmatch.carChallenge;

public class Car {
    private String model;
    private double priceYear1;
    private double priceYear2;
    private double priceYear3;

    public void defineCarModel(String model){
        this.model = model;
    }

    public void defineCarPrice(double priceYear1, double priceYear2, double priceYear3){
        this.priceYear1 = priceYear1;
        this.priceYear2 = priceYear2;
        this.priceYear3 = priceYear3;
    }

    public double returnMaximumPrice(){
        double[] numbers = {priceYear1, priceYear2, priceYear3};
        double max = numbers[0];

        for (double number : numbers) {
            max = Math.max(max, number);
        }

        return max;
    }

    public double returnMinimumPrice(){
        double[] numbers = {priceYear1, priceYear2, priceYear3};
        double min = numbers[0];

        for (double number : numbers) {
            min = Math.min(min, number);
        }

        return min;
    }

    public void showInfo(){
        System.out.println("Model: " + model);
        System.out.println("Price Year 1: " + priceYear1);
        System.out.println("Price Year 2: " + priceYear2);
        System.out.println("Price Year 3: " + priceYear3);
        System.out.println("Maximum price: " + returnMaximumPrice());
        System.out.println("Minimum price: " + returnMinimumPrice());
    }
}
