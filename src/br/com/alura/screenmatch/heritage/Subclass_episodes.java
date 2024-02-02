package br.com.alura.screenmatch.heritage;

public class Subclass_episodes implements Classification {
    private int number;
    private String name;
    private Subclass_series serie;
    private int totalViews;

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public Subclass_series getSerie() {
        return serie;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSerie(Subclass_series serie) {
        this.serie = serie;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    @Override
    public int getClassification() {
        if (totalViews > 100){
            return 4;
        } else {
            return 2;
        }
    }
}
