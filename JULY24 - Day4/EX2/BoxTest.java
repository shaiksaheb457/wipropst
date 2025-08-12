package com.wipro.exception;

public class BoxTest {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.setItem(123);
        System.out.println("Integer Value: " + intBox.getItem());

        Box<String> strBox = new Box<>();
        strBox.setItem("Hello,World!!");
        System.out.println("String Value: " + strBox.getItem());

        Box<Double> dblBox = new Box<>();
        dblBox.setItem(45.67);
        System.out.println("Double Value: " + dblBox.getItem());
    }
}
