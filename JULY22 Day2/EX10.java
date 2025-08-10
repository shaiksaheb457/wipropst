package com.wipro.basic;

public class EX10 {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

        do {
            if (num % 2 == 0) {
                sum += num;
            }
            num++;
        } while (num <= 100);

        System.out.println("Sum of even numbers from 1 to 100 is: " + sum);
    }
}
