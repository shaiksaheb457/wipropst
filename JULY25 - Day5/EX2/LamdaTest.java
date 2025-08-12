package com.wipro.bank;

public class LamdaTest {
    public static void main(String[] args) {

        Lamda greeting = () -> System.out.println("Hello Lambda");

        greeting.sayHello();
    }
}
