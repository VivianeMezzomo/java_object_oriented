package br.com.alura.screenmatch.temperatureChallenge;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{

    @Override
    public void celsiusParaFahrenheit(double celsius) {
        double result = (celsius * 9.00/5.00) + 32.00;
        System.out.println("A temperatura em Fahrenheit é igual a: "+ result);
    }

    @Override
    public void fahrenheitParaCelsius(double fahrenheit) {
        double result = (fahrenheit - 32.00) * (5.00/9.00);
        System.out.println("A temperatura em Celsius é igual a: "+ result);
    }
}
