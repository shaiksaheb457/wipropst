package com.wipro.basic;

public class EX19 {
    public static void main(String[] args) {
        String original = "Madam";
        String Str = original.toLowerCase();

        StringBuilder sb = new StringBuilder(Str);
        String reversed = sb.reverse().toString();

        if (Str.equals(reversed)) {
            System.out.println(original + " palindrome");
        } else {
            System.out.println(original + " palindrome");
        }
    }
}
