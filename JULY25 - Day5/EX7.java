package com.wipro.bank;

import java.util.function.Consumer;

public class EX7 {
    public static void main(String[] args) {
        Consumer<Integer> nextEven = n -> System.out.println("Next even: " + (n % 2 == 0 ? n + 2 : n + 1));
        nextEven.accept(5);     
        nextEven.accept(100);   
    }
}