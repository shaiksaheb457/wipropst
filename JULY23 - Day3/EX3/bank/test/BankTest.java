package com.wipro.bank.test;

import com.wipro.bank.BankOps;
import com.wipro.bank.HDFC;
import com.wipro.bank.Citi;

public class BankTest {
    public static void main(String[] args) {
        BankOps hdfc = new HDFC();
        BankOps citi = new Citi();

        // HDFC Operations
        hdfc.deposit(2000, "HDFC001");
        hdfc.withdraw(500, "HDFC001");
        hdfc.withdraw(1800, "HDFC001"); // should show insufficient

        // Citi Operations
        citi.deposit(3000, "CITI001");
        citi.withdraw(1000, "CITI001");
        citi.withdraw(2500, "CITI001"); // should show insufficient
    }
}
