package com.medialibrary.app;

import com.medialibrary.domain.Movie;

public class Main {
    public static void main(String[] args) {
        Movie testing = new Movie("Se7en", 1995, "David Fincher", 127);
        System.out.println(testing);
    }
}
