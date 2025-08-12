package com.wipro.bank;

public class BankTest {
    public static void main(String[] args) {
        BankOps savingsAccount = new BankOps() {
            double balance = 1000.0;

            @Override
            public void deposit(double amount) {
                balance += amount;
                System.out.println("Savings Account: Deposited " + amount + ", New Balance: " + balance);
            }
        };

        BankOps currentAccount = new BankOps() {
            double balance = 5000.0;

            @Override
            public void deposit(double amount) {
                balance += amount;
                System.out.println("Current Account: Deposited " + amount + ", New Balance: " + balance);
            }
        };

        savingsAccount.deposit(2000);
        currentAccount.deposit(3000);
    }
}
