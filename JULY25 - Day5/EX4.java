package com.wipro.bank;

import java.util.function.Predicate;
import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        Predicate<String> isPalindrome = s -> s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());

        System.out.println(isPalindrome.test(input) ? "Palindrome" : "Not a palindrome");
        sc.close();
    }
}
