package com.wipro.day3;

public class EX7 {
    public static void main(String[] args) {
        String fName = null;

        try {
            // This will throw a NullPointerException
            String upperName = fName.toUpperCase();
            System.out.println("Uppercase Name: " + upperName);
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: fName is null");
        }

        System.out.println("Program continues after handling exception.");
    }
}
