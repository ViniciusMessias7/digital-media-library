package com.medialibrary.app;

import com.medialibrary.domain.*;

public class Main {
    public static void main(String[] args) {
        Library library69 = new Library();
        Book book1 = new Book("The Godfather", 1969, "9788055111360", "G. P. Putnam's Sons");
        Movie movie1 = new Movie("Se7en", 1995, "David Fincher", 127);
        MusicAlbum musicAlbum1 = new MusicAlbum("Xero", 1997, "Linkin Park", 10);

        library69.addMediaItem(book1);
        library69.addMediaItem(movie1);
        library69.addMediaItem(musicAlbum1);


        library69.showMedias();
        System.out.println();

        MediaItem foundItem = library69.findMediaItemByTitle("Xero");
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
