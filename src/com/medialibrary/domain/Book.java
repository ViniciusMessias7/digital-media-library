package com.medialibrary.domain;

public class Book extends MediaItem {
    private final String isbn;
    private final String publisher;

    public Book(String title, int yearPublication, String isbn, String publisher) {
        super(title, yearPublication);
        this.isbn = isbn;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book [Title: " + getTitle() +
                ", Year: " + getYearPublication() +
                ", ISBN: " + this.isbn +
                ", Publisher: " + this.publisher +
                "]";

    }

    public String getIsbn() {
        return this.isbn;
    }

    public String getPublisher() {
        return this.publisher;
    }
}
