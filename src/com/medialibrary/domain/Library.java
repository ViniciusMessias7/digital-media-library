package com.medialibrary.domain;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<MediaItem> mediaItems;

    public Library() {
        this.mediaItems = new ArrayList<>();
    }

    public void addMediaItem(MediaItem media) {
        this.mediaItems.add(media);
    }

    public MediaItem removeMediaItemByTitle(String titleToRemove) {
        MediaItem mediaToRemove = findMediaItemByTitle(titleToRemove);
        if (mediaToRemove == null) {
            return null;
        }
        mediaItems.remove(mediaToRemove);
        return mediaToRemove;
    }

    public MediaItem findMediaItemByTitle(String titleSearch) {
        for (MediaItem mediaItem : mediaItems) {
            if (mediaItem.getTitle().equalsIgnoreCase(titleSearch)) {
                return mediaItem;
            }
        }
        return null;
    }

    public void showMedias() {
        if (mediaItems.isEmpty()) {
            System.out.println("The library is currently empty.");
            return;
        }
        System.out.println("--- Library Contents ---");
        for (int i = 0; i < mediaItems.size(); i++) {
            System.out.println("Media Type: " + mediaItems.get(i).getMediaType());
            System.out.println(mediaItems.get(i));
            if (i < mediaItems.size() - 1) {
                System.out.print("\n");
            }
        }
        System.out.println("------------------------");
    }

}
