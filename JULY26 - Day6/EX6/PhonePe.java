package com.wipro.threads;

public class PhonePe implements Payment {
    public void makePayment(double amount) {
        System.out.println("Paid ₹" + amount + " using PhonePe");
    }
}