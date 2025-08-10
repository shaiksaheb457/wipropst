package com.wipro.basic;

public class EX17 {
    enum Month {
        JANUARY, 
        FEBRUARY, 
        MARCH, 
        APRIL, 
        MAY, 
        JUNE,
        JULY,
        AUGUST, 
        SEPTEMBER, 
        OCTOBER, 
        NOVEMBER,
        DECEMBER
    }

    public static void main(String[] args) {
        for (Month m : Month.values()) {
            System.out.println(m);
        }

        Month month = Month.FEBRUARY;

        if (month == Month.FEBRUARY) {
            System.out.println("The assigned month is FEBRUARY");
        } else {
            System.out.println("The assigned month is NOT FEBRUARY");
        }
    }
}
