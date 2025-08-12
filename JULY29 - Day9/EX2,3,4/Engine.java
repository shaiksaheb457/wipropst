package com.wipro.springdemo1;

public class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Engine [type=" + type + "]";
    }
}
