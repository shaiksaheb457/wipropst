
package com.wipro.basic;

import java.util.Scanner;

public class EX6 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number: ");
        double number = scanner.nextDouble();

        System.out.println("Input value: " + number);

        if (number == 0) {
            System.out.println("Zero");
        } else {
            String result = "";

            if (number > 0) {
                result = "Positive";
            } else {
                result = "Negative";
            }

            double absValue = Math.abs(number);

            if (absValue < 1) {
                result += " and small";
            } else if (absValue > 1000000) {
                result += " and large";
            }

            System.out.println(result);
        }

        scanner.close();
    }
}
