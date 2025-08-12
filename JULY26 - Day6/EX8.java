package com.wipro.threads;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    @Test
    public void testUpperCaseString() {
        assertTrue(StringUtils.isUpperCase("HELLO"));
    }

    @Test
    public void testLowerCaseString() {
        assertFalse(StringUtils.isUpperCase("hello"));
    }

    @Test
    public void testMixedCaseString() {
        assertFalse(StringUtils.isUpperCase("Hello"));
    }

    @Test
    public void testEmptyString() {
        assertFalse(StringUtils.isUpperCase("")); 
    }

    @Test
    public void testNullString() {
        assertFalse(StringUtils.isUpperCase(null));
    }
}
