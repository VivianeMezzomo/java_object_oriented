package br.com.alura.screenmatch.heritage;

public class Subclass_series extends Superclass_title {
    private int seasons;
    private boolean active;
    private int episodesPerSeason;
    private int minutesPerEpisode;

    public int getSeasons() {
        return seasons;
    }

    public boolean isActive() {
        return active;
    }

    public int isEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public int getMinutesPerEpisode() {
        return minutesPerEpisode;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public void setMinutesPerEpisode(int minutesPerEpisode) {
        this.minutesPerEpisode = minutesPerEpisode;
    }

    @Override
    public int getMinDuration(){
        return seasons * episodesPerSeason * minutesPerEpisode;
    }
}
