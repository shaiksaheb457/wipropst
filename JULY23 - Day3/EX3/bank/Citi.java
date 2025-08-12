package com.wipro.bank;

import java.util.HashMap;

public class Citi implements BankOps {
    private HashMap<String, Double> accounts = new HashMap<>();

    @Override
    public void deposit(double amount, String accNumber) {
        double bonus = 0.02 * amount; // 2% bonus
        double total = amount + bonus;
        accounts.put(accNumber, accounts.getOrDefault(accNumber, 0.0) + total);
        System.out.println("Citi: Deposited ₹" + amount + " (+₹" + bonus + " bonus) to account " + accNumber);
    }

    @Override
    public double withdraw(double amount, String accNumber) {
        double balance = accounts.getOrDefault(accNumber, 0.0);
        if (balance >= amount) {
            accounts.put(accNumber, balance - amount);
            System.out.println("Citi: Withdrew ₹" + amount + " from account " + accNumber);
            return amount;
        } else {
            System.out.println("Citi: Insufficient funds in account " + accNumber);
            return 0.0;
        }
    }
}
