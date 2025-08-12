package com.wipro.restaurant;

public class Restaurant {
    private String name;
    private String location;
    private int rating;

    // Constructor
    public Restaurant(String name, String location, int rating) {
        this.name = name;
        this.location = location;
        this.rating = rating;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getRating() {
        return rating;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    // toString method
    @Override
    public String toString() {
        return "Restaurant [Name=" + name + ", Location=" + location + ", Rating=" + rating + "]";
    }
}
