package com.wipro.basic;

import java.util.Scanner;

public class EX8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input floating-point number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Input floating-point another number: ");
        double num2 = scanner.nextDouble();

        // Round both numbers to 3 decimal places
        long roundedNum1 = Math.round(num1 * 1000);
        long roundedNum2 = Math.round(num2 * 1000);

        if (roundedNum1 == roundedNum2) {
            System.out.println("They are the same");
        } else {
            System.out.println("They are different");
        }

        scanner.close();
    }
}
