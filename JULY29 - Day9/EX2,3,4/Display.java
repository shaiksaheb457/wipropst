package com.wipro.springdemo1;

import org.springframework.stereotype.Component;

@Component
public class Display {
    private int size;

    // Constructor
    public Display() {
        this.size = 6; // Default value
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Display [size=" + size + "]";
    }
}
