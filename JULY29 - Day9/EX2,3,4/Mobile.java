package com.wipro.springdemo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
    private Display display;

    // Constructor injection
    @Autowired
    public Mobile(Display display) {
        this.display = display;
    }

    @Override
    public String toString() {
        return "Mobile with " + display;
    }
}
