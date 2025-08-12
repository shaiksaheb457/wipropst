package com.wipro.exception;

import java.util.HashSet;
import java.util.Set;

public class EX4 {
    public static void main(String[] args) {
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        setA.add(5);

        setB.add(4);
        setB.add(5);
        setB.add(6);

        System.out.println("Set A: " + setA);
        System.out.println("Set B: " + setB);

        Set<Integer> difference = new HashSet<>(setA); 
        difference.removeAll(setB);                   

        System.out.println("Difference (A - B): " + difference);
    }
}

