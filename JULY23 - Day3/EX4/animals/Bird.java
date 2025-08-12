package com.wipro.animals;

public class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println("Sound: Chirping...");
    }
}
