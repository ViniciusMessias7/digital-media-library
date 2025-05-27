package com.medialibrary.app;

import com.medialibrary.domain.Book;
import com.medialibrary.domain.Library;
import com.medialibrary.domain.MediaItem;
import com.medialibrary.domain.Movie;

public class Main {
    public static void main(String[] args) {
        Library library69 = new Library();
        Book book1 = new Book("The Godfather", 1969, "9788055111360", "G. P. Putnam's Sons");
        Movie movie1 = new Movie("Se7en", 1995, "David Fincher", 127);

        library69.addMediaItem(book1);
        library69.addMediaItem(movie1);
        library69.showMedias();

        MediaItem foundItem = library69.findMediaItemByTitle("Se7en");
        if (foundItem == null) {
            System.out.println("Media item not found.");
        } else {
            System.out.println("Found " + foundItem);
        }
        System.out.println();


        MediaItem removeItem = library69.removeMediaItemByTitle("the godfather");
        if (removeItem == null) {
            System.out.println("This media don't exist!");
        } else {
            System.out.println("Removed " + removeItem);
        }
    }
}
