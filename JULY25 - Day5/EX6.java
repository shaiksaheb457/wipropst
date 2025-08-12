package com.wipro.bank;

import java.time.LocalDate;
import java.util.function.Supplier;
import java.time.format.TextStyle;
import java.util.Locale;

public class EX6 {
    public static void main(String[] args) {
        Supplier<String> tomorrow = () -> LocalDate.now().plusDays(1)
                .getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.ENGLISH);

        System.out.println("Tomorrow is " + tomorrow.get());
    }
}
