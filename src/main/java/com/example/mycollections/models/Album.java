package com.example.mycollections.models;

public class Album extends LibraryItem {


    // Instance Variables
    private String artist;
    int tracks;

    // Constructor
    public Album(String name, int year, String artist, int trackCount) {
        super(name, year);
        this.artist = artist;
        this.tracks = trackCount;
    }

    // Getters and Setters

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getTracks() {
        return tracks;
    }

    // Override Methods

    @Override
    public String toString() {
        return "Album: " + getName() + " by " + getArtist() + " (" + getYear() + ") - " + getTracks() + " tracks";
    }
}
