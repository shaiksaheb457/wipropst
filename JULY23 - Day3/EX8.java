package com.wipro.day3;

public class EX8 {

    public static double changeCurrency(int number) throws NumberFormatException {
        if (number == 0) {
            throw new NumberFormatException("Invalid Number");
        }
        return number * 80;
    }

    public static void main(String[] args) {
        try {
            int input = 0; 
            double result = changeCurrency(input);
            System.out.println("Converted amount: ₹" + result);
        } catch (NumberFormatException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
