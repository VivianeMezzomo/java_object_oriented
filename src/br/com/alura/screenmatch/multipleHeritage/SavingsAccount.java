package br.com.alura.screenmatch.multipleHeritage;

public class SavingsAccount extends Account {
    private double interestRate;

    public void calculateFees(){
        double fees = this.balance * interestRate;
        System.out.println("Current interest: " + fees);
    }
}
