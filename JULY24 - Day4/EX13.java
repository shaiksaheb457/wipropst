package com.wipro.exception;

import java.time.LocalDate;
import java.util.Scanner;

public class EX13 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int y = sc.nextInt(), m = sc.nextInt(), d = sc.nextInt();
            System.out.println(y + (LocalDate.of(y, m, d).isLeapYear() ? " is a leap year." : " is not a leap year."));
        }
    }
}
