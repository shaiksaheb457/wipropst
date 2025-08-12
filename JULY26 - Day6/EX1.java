package com.wipro.threads;

public class EX1 {
    public static void main(String[] args) {
        
        // Thread to print numbers from 1 to 10
        Thread numberThread = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Number: " + i);
                try {
                    Thread.sleep(200); // Delay for readability
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Thread to print letters from A to J
        Thread alphabetThread = new Thread(() -> {
            for (char c = 'A'; c <= 'J'; c++) {
                System.out.println("Letter: " + c);
                try {
                    Thread.sleep(200); // Delay for readability
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Start both threads
        numberThread.start();
        alphabetThread.start();
    }
}
