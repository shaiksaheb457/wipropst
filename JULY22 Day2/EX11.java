package com.wipro.basic;

public class EX11 {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 1, 9, 5};  
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }

        System.out.println("Doubled array values:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
