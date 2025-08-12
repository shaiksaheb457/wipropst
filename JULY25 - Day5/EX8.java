package com.wipro.bank;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.util.function.Consumer;

public class EX8 {
    public static void main(String[] args) {
        Consumer<ZoneId> printTime = zone -> 
            System.out.println("Current time in London: " + ZonedDateTime.now(zone).toLocalTime());
        
        printTime.accept(ZoneId.of("Europe/London"));
    }
}

