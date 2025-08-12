package com.wipro.bank;



public class FoodItem {
    private String foodName;
    private String foodType;
    private String cuisine;
    private double price;

    public FoodItem(String foodName, String foodType, String cuisine, double price) {
        this.foodName = foodName;
        this.foodType = foodType;
        this.cuisine = cuisine;
        this.price = price;
    }

    public String getCuisine() {
        return cuisine;
    }
    
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return foodName + " - " + cuisine + " - " + foodType + " - Rs." + price;
    }
}
