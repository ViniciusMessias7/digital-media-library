package com.medialibrary.domain;

public abstract class MediaItem {
    private final String title;
    private final int yearPublication;

    public MediaItem(String title, int yearPublication) {
        this.title = title;
        this.yearPublication = yearPublication;
    }

    @Override
    public String toString() {
        return "Media [" + "Title: " + this.title + ", Year: " + this.yearPublication + "]";
    }

    public String getTitle() {
        return this.title;
    }

    public int getYearPublication() {
        return this.yearPublication;
    }

    public abstract String getMediaType();

}
