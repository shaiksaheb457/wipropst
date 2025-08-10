package com.wipro.basic;

public class EX18 {
    public static void main(String[] args) {
        String original = "Madam";
        String lowerCaseStr = original.toLowerCase();

        boolean isPalindrome = true;

        for (int i = 0; i < lowerCaseStr.length() / 2; i++) {
            if (lowerCaseStr.charAt(i) != lowerCaseStr.charAt(lowerCaseStr.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(original + " is a palindrome");
        } else {
            System.out.println(original + " is not a palindrome");
        }
    }
}
