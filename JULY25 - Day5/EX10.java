package com.wipro.bank;

import java.util.*;
import java.util.function.Function;

public class EX10 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jayanta", "Amit", "Vasu");

        Function<List<String>, List<Integer>> getLengths = list -> {
            List<Integer> lengths = new ArrayList<>();
            for (String name : list) {
                lengths.add(name.length());
            }
            return lengths;
        };

        System.out.println(getLengths.apply(names));  
    }
}

