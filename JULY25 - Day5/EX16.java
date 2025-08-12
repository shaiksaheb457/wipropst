package com.wipro.bank;

import java.util.Optional;

public class EX16 {
    public static void main(String[] args) {
        Optional<Integer> number = Optional.of(100);

        number.ifPresent(n -> System.out.println("Value: " + n)); 
        Integer fallback = number.orElse(0); 
        System.out.println("Fallback value: " + fallback);
    }
}
