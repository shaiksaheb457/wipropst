package com.wipro.threads;

public class Paytm implements Payment {
    public void makePayment(double amount) {
        System.out.println("Paid ₹" + amount + " using Paytm");
    }
}