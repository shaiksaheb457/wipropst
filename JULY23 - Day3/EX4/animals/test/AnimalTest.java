package com.wipro.animals.test;

import com.wipro.animals.*;

public class AnimalTest {
    public static void main(String[] args) {
        Animal human = new Human("Saheb", 25);
        Animal bird = new Bird("Pegion", 2);
        Animal dog = new Dog("Rocky", 5);

        System.out.println(human);
        human.makeSound();
        human.eat();
        human.sleep();

        System.out.println();

        System.out.println(bird);
        bird.makeSound();
        bird.eat();
        bird.sleep();

        System.out.println();

        System.out.println(dog);
        dog.makeSound();
        dog.eat();
        dog.sleep();
    }
}
