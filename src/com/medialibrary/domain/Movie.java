package com.medialibrary.domain;

public class Movie extends MediaItem {
    private final String director;
    private final int durationInMinutes;
    
    public Movie(String title, int yearPublication, String director, int durationInMinutes) {
        super(title, yearPublication);
        this.director = director;
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    public String toString() {
        return "[Title: " + getTitle() +
                ", Year: " + getYearPublication() +
                ", Director: " + this.director +
                ", Duration: " + this.durationInMinutes +
                " min]";
    }

    public String getDirector() {
        return this.director;
    }

    public int getDurationInMinutes() {
        return this.durationInMinutes;
    }

    @Override
    public String getMediaType() {
        return "Movie";
    }
}
