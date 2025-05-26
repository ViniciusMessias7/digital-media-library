package com.medialibrary.app;


import com.medialibrary.domain.MediaItem;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Testing MediaItem ---");
        MediaItem genericItem = new MediaItem("Se7en", 1995);
        System.out.println(genericItem);
    }
}
