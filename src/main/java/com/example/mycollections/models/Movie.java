package com.example.mycollections.models;

public class Movie extends LibraryItem{

    // Instance Variables
    String director;
    int runtime;

    // Constructor
    public Movie(String name, int year, String director, int durationInMinutes) {
        super(name,
                year);
        this.director = director;
        this.runtime = durationInMinutes;
    }

    // Getter
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getRuntime() {
        return runtime;
    }

    // Overide

    @Override
    public String toString() {
        return "Movie: " + getName() + " by " + getDirector() + " (" + getYear() + ") - " + getRuntime() + " minutes";
    }
}
