package br.com.alura.screenmatch.heritage;

import br.com.alura.screenmatch.heritage.Classification;

public class Subclass_movie extends Superclass_title implements Classification {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassification() {
        return (int) returnsAverage() / 2;
    }
}
