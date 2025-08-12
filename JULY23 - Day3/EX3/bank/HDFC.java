package com.wipro.bank;

import java.util.HashMap;

public class HDFC implements BankOps {
    private HashMap<String, Double> accounts = new HashMap<>();

    @Override
    public void deposit(double amount, String accNumber) {
        accounts.put(accNumber, accounts.getOrDefault(accNumber, 0.0) + amount);
        System.out.println("HDFC: Deposited ₹" + amount + " to account " + accNumber);
    }

    @Override
    public double withdraw(double amount, String accNumber) {
        double balance = accounts.getOrDefault(accNumber, 0.0);
        if (balance >= amount) {
            accounts.put(accNumber, balance - amount);
            System.out.println("HDFC: Withdrew ₹" + amount + " from account " + accNumber);
            return amount;
        } else {
            System.out.println("HDFC: Insufficient funds in account " + accNumber);
            return 0.0;
        }
    }
}
