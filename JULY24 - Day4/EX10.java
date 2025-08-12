package com.wipro.exception;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EX10 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 11, 1);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String formattedDate = date.format(formatter);
        System.out.println("Formatted Date: " + formattedDate);
    }
}
