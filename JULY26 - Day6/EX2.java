package com.wipro.threads;

public class StringUtils {
    public static boolean isUpperCase(String input) {
        if (input == null || input.isEmpty()) {
            return false; 
        }
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c) && !Character.isUpperCase(c)) {
                return false;
            }
        }
        return true;
    }
}
