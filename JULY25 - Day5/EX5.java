package com.wipro.bank;

import java.util.function.Predicate;

public class EX5 {
    public static void main(String[] args) {
        Predicate<String> isUpperCase = str -> str.equals(str.toUpperCase());
        Predicate<String> isLowerCase = str -> str.equals(str.toLowerCase());

        String test1 = "HELLO";
        String test2 = "hello";
        String test3 = "Hello";

        System.out.println(test1 + " is uppercase? " + isUpperCase.test(test1));
        System.out.println(test2 + " is lowercase? " + isLowerCase.test(test2));
        System.out.println(test3 + " is uppercase? " + isUpperCase.test(test3));
        System.out.println(test3 + " is lowercase? " + isLowerCase.test(test3));
    }
}
