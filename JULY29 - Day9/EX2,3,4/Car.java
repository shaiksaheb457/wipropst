package com.wipro.springdemo1;

public class Car {
    private String brand;
    private Engine engine;

    public Car(String brand, Engine engine) {
        this.brand = brand;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car [brand=" + brand + ", engine=" + engine + "]";
    }
}
