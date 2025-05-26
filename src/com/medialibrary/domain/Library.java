package com.medialibrary.domain;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<MediaItem> mediaItems;

    public Library() {
        this.mediaItems = new ArrayList<>();
    }

    public void showMedias() {
        System.out.println("--- Library Contents ---");
        if (mediaItems.isEmpty()) {
            System.out.println("The library is currently empty.");
            return;
        }
        for (MediaItem mediaItem : mediaItems) {
            System.out.println(mediaItem);
        }
        System.out.println("------------------------");
    }

    public void addMediaItem(MediaItem media) {
        this.mediaItems.add(media);
    }
}
