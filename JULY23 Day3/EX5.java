package com.wipro.day3;

class Converter {
    int convert(int a) {
        return a * 2;
    }

    int convert(int a, int b) {
        return a + b;
    }

    double convert(double a) {
        return a / 2;
    }
}

public class EX5 {
    public static void main(String[] args) {
        Converter converter = new Converter();
        
        int result1 = converter.convert(5);
        int result2 = converter.convert(5, 10);
        double result3 = converter.convert(8.0);
        
        System.out.println("Result of convert(int a): " + result1);
        System.out.println("Result of convert(int a, int b): " + result2);
        System.out.println("Result of convert(double a): " + result3);
    }
}
