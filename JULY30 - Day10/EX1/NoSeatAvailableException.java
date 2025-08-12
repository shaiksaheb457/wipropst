package com.wipro.trip;

public class NoSeatAvailableException extends Exception {
    public NoSeatAvailableException(String message) {
        super(message);
    }
}
