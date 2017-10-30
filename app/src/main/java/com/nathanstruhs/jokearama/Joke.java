package com.nathanstruhs.jokearama;

public class Joke {

    private String title;
    private String[] joke;
    private boolean hasBeenViewed;

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String[] getJoke() { return joke; }
    public void setJoke(String[] joke) { this.joke = joke; }

    public boolean isHasBeenViewed() { return hasBeenViewed; }
    public void setHasBeenViewed(boolean hasBeenViewed) { this.hasBeenViewed = hasBeenViewed; }
}
