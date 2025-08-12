package com.wipro.bank;

import java.util.function.Function;

public class EX9 {
    public static void main(String[] args) {
        Function<Double, String> fraction = n -> String.format("%.3f", n % 1);
        System.out.println("Just the fraction: " + fraction.apply(99.785));
    }
}

