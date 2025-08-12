package com.wiproA.mockitodemo;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class EX5 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Zara", "Mike", "Anna", "Bob", "John");

        List<String> sortedNames = names.stream()
                                        .sorted(String::compareTo)
                                        .collect(Collectors.toList());

        System.out.println("Sorted Names:");
        sortedNames.forEach(System.out::println);
    }
}
