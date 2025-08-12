package com.wipro.exception;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class EX11 {

    public static int getAge(LocalDate dt) {
        LocalDate today = LocalDate.now();
        Period age = Period.between(dt, today);
        return age.getYears();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birth year (e.g. 2000): ");
        int year = scanner.nextInt();

        System.out.print("Enter your birth month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter your birth day (1-31): ");
        int day = scanner.nextInt();

        LocalDate birthDate = LocalDate.of(year, month, day);

        int age = getAge(birthDate);
        System.out.println("You are " + age + " years old.");

        scanner.close();
    }
}
