package br.com.alura.screenmatch.heritage;

public class Superclass_title {
    private String movieName;
    private int releaseYear;
    private double ratingsSum;
    private int ratingsTotal;
    private int minDuration;

    public void displayTechnicalSheet(){
        System.out.println("Movie name: " + movieName);
        System.out.println("Release year: " + releaseYear);
        System.out.println("Duration in minutes: " + minDuration);
    }

    public void rate(double nota){
        ratingsSum += nota;
        ratingsTotal++;
    }

    public double returnsAverage(){
        return ratingsSum / ratingsTotal;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setMinDuration(int minDuration) {
        this.minDuration = minDuration;
    }

    public double getRatingsSum() {
        return ratingsSum;
    }

    public int getRatingsTotal() {
        return ratingsTotal;
    }

    public int getMinDuration() {
        return minDuration;
    }
}
