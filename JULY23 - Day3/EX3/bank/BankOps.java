package com.wipro.bank;

public interface BankOps {
		
    void deposit(double amount, String accNumber);
    double withdraw(double amount, String accNumber);
}
