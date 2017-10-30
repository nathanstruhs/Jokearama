package com.nathanstruhs.jokearama;

import java.util.UUID;

public class Joke {

    private UUID id;
    private String title;
    private String[] joke;
    private boolean hasBeenViewed = false;

    public Joke() { this(UUID.randomUUID()); }

    public Joke(UUID id) {
        this.id = id;
    }

    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String[] getJoke() { return joke; }
    public void setJoke(String[] joke) { this.joke = joke; }

    public boolean isHasBeenViewed() { return hasBeenViewed; }
    public void setHasBeenViewed(boolean hasBeenViewed) { this.hasBeenViewed = hasBeenViewed; }
}
