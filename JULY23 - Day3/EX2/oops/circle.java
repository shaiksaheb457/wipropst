package com.wipro.oops;

public class circle extends shape {
    private double radius;

    public circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "circle{" +
                "radius=" + radius + ", " +
                super.toString() +
                '}';
    }
}
