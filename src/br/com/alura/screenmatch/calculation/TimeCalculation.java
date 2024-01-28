package br.com.alura.screenmatch.calculation;

//import br.com.alura.screenmatch.heritage.Subclass_movie;
//import br.com.alura.screenmatch.heritage.Subclass_series;
import br.com.alura.screenmatch.heritage.Superclass_title;

public class TimeCalculation {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

//    public void include(Subclass_movie m){
//        totalTime += m.getMinDuration();
//    }
//
//    public void include(Subclass_series s){
//        totalTime += s.getMinDuration();
//    }

    public void include(Superclass_title title){
        System.out.println("Adding minutes duration of: " + title);
        totalTime += title.getMinDuration();
    }
}
