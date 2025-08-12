package com.wipro.bank;

public class MultiplyTest {
    public static void main(String[] args) {
        
        Multiply product = (a, b) -> a * b;

        int result = product.multiply(5, 4);

        System.out.println("Multiplication Result: " + result);
    }
}
