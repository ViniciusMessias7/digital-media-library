package com.medialibrary.app;

import com.medialibrary.domain.Book;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("The Godfather",1969,"9788055111360","G. P. Putnam's Sons");
        System.out.println(book1);
    }
}
