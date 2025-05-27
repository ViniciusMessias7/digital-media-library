package com.medialibrary.domain;

public class MusicAlbum extends MediaItem {
    private final String artist;
    private final int numberOfTracks;

    public MusicAlbum(String title, int yearPublication, String artist, int numberOfTracks) {
        super(title, yearPublication);
        this.artist = artist;
        this.numberOfTracks = numberOfTracks;
    }

    @Override
    public String toString() {
        return "[Title: " + getTitle() +
                ", Year: " + getYearPublication() +
                ", Artist: " + this.artist +
                ", Tracks: " + this.numberOfTracks +
                "]";

    }

    @Override
    public String getMediaType() {
        return "Music album";
    }

    public String getArtist() {
        return artist;
    }

    public int getNumberOfTracks() {
        return numberOfTracks;
    }

}
