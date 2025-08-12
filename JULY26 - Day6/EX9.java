package com.wipro.threads;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class LowercaseTest {

    public static boolean isLowerCase(String str) {
        return str != null && str.equals(str.toLowerCase());
    }

    @ParameterizedTest
    @ValueSource(strings = { "hello", "world", "java" })
    void testLowercase(String input) {
        assertTrue(isLowerCase(input));
    }
}
