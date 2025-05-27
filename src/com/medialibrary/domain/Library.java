package com.medialibrary.domain;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<MediaItem> mediaItems;

    public Library() {
        this.mediaItems = new ArrayList<>();
    }

    public void showMedias() {
        if (mediaItems.isEmpty()) {
            System.out.println("The library is currently empty.");
            return;
        }
        for (MediaItem mediaItem : mediaItems) {
            System.out.println("Media Type: " + mediaItem.getMediaType());
            System.out.println(mediaItem);
            System.out.println();
        }
    }

    public void addMediaItem(MediaItem media) {
        this.mediaItems.add(media);
    }

    public MediaItem findMediaItemByTitle(String titleSearch) {
        for (MediaItem mediaItem : mediaItems) {
            if (mediaItem.getTitle().equalsIgnoreCase(titleSearch)) {
                return mediaItem;
            }
        }
        return null;
    }
}
