package com.medialibrary.app;

import com.medialibrary.domain.Book;
import com.medialibrary.domain.Library;
import com.medialibrary.domain.Movie;

public class Main {
    public static void main(String[] args) {
        Library library69 = new Library();
        Book book1 = new Book("The Godfather", 1969, "9788055111360", "G. P. Putnam's Sons");
        Movie movie1 = new Movie("Se7en", 1995, "David Fincher", 127);

        library69.addMediaItem(book1);
        library69.addMediaItem(movie1);

        library69.showMedias();
    }
}
