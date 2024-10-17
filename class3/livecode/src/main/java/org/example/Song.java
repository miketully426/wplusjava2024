package org.example;

public class Song {

    private String artist;
    private String title;
    private String genre;

    public Song(String artist, String title, String genre) {
        this.artist = artist;
        this.title = title;
        this.genre = genre;
    }

    public String getArtist() {
        return this.artist;
    }

    public String getTitle() {
        return this.title;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return this.title + " - " + this.artist;
    }

    @Override
    public boolean equals(Object toBeCompared) {
        if (toBeCompared == this) {
            return true;
        }
        if (toBeCompared == null) {
            return false;
        }
        if (toBeCompared.getClass() != this.getClass()) {
            return false;
        }
        Song songToCompare = (Song) toBeCompared;
        return songToCompare.getTitle().equals(this.getTitle())
                && songToCompare.getArtist().equals(this.getArtist());
    }

}
