package com.wipro.threads;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EX7{

    public static boolean isUpperCase(String str) {
        return str != null && str.equals(str.toUpperCase());
    }

    @Test
    void testUpperCase() {
        assertTrue(isUpperCase("HELLO"));
    }

    @Test
    void testNotUpperCase() {
        assertFalse(isUpperCase("Hello"));
    }
}

