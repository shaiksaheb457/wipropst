package com.wipro.day3;

interface PaymentMethod {
    void pay(double amount);
}

class Gpay implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Gpay");
    }
}

class PhonePay implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PhonePay");
    }
}

public class EX6 {
    public static void main(String[] args) {
        PaymentMethod payment = new Gpay();
        payment.pay(500.0);
        
        payment = new PhonePay();
        payment.pay(750.0);
    }
}
