package com.wipro.exception;

import java.util.*;

public class EX6 {
    public static void main(String[] args) {
        Map<String, String> currencyMap = new HashMap<>();
        currencyMap.put("USD", "United States Dollar");
        currencyMap.put("INR", "Indian Rupee");
        currencyMap.put("EUR", "Euro");
        currencyMap.put("JPY", "Japanese Yen");
        currencyMap.put("GBP", "British Pound");

        List<Map.Entry<String, String>> entryList = new ArrayList<>(currencyMap.entrySet());

        entryList.sort(Map.Entry.comparingByValue());

        System.out.println("Currency List (Sorted by Name):");
        for (Map.Entry<String, String> entry : entryList) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}

