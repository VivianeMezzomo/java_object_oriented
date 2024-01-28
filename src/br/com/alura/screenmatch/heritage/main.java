package br.com.alura.screenmatch.heritage;

import br.com.alura.screenmatch.calculation.TimeCalculation;

public class main {
    public static void main(String[] args) {
        Subclass_movie subclassMovie = new Subclass_movie();
        subclassMovie.setMovieName("O poderoso chefão");
        subclassMovie.setReleaseYear(1970);
        subclassMovie.setMinDuration(180);
        System.out.println("Movie duration: " + subclassMovie.getMinDuration());

        subclassMovie.displayTechnicalSheet();
        subclassMovie.rate(8);
        subclassMovie.rate(5);
        subclassMovie.rate(9);
        System.out.println(subclassMovie.getRatingsSum());
        System.out.println(subclassMovie.getRatingsTotal());

        System.out.println(subclassMovie.returnsAverage());

        Subclass_series lost = new Subclass_series();
        lost.setMovieName("Lost");
        lost.setReleaseYear(2000);
        lost.displayTechnicalSheet();
        lost.setSeasons(10);
        lost.setEpisodesPerSeason(10);
        lost.setMinutesPerEpisode(50);
        System.out.println("Duration to marathon Lost: " + lost.getMinDuration());


        Subclass_movie anotherSubclassMovie = new Subclass_movie();
        anotherSubclassMovie.setMovieName("Avatar");
        anotherSubclassMovie.setReleaseYear(2023);
        anotherSubclassMovie.setMinDuration(200);

        TimeCalculation calculator = new TimeCalculation();
        calculator.include(subclassMovie);
        calculator.include(anotherSubclassMovie);
        calculator.include(lost);
        System.out.println(calculator.getTotalTime());
    }
}
