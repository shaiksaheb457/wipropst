package com.wipro.basic;

public class EX20 {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("Not anagrams");
            return;
        }

        int[] letters = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            letters[str1.charAt(i) - 'a']++;
            letters[str2.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (letters[i] != 0) {
                System.out.println("Not anagrams");
                return;
            }
        }

        System.out.println("Anagrams");
    }
}
