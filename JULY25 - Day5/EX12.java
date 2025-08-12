package com.wipro.bank;

import java.util.*;
import java.util.stream.Collectors;

public class EX12 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jayanta", "Jnanedra", "Anjali", "Jaya", "Kajal");

        List<String> result = names.stream()
                                   .filter(name -> name.toLowerCase().contains("ja"))
                                   .collect(Collectors.toList());

        System.out.println("Names with 'ja': " + result);
    }
}
