package com.wipro.basic;

public class HelloWorld {
    public static void main(String[] args) {
        char shape = 'Y'; // You can change this to 'C', 'S', or any other letter

        switch (shape) {
            case 'R':
                System.out.println("Rectangle");
                break;
            case 'C':
                System.out.println("Circle");
                break;
            case 'S':
                System.out.println("Square");
                break;
            default:
                System.out.println("Other");
        }
    }
}
