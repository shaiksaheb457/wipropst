package com.wipro.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintTask implements Runnable {
    private final int taskId;

    PrintTask(int taskId) {
        this.taskId = taskId;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Task " + taskId + " - " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Task " + taskId + " interrupted");
            }
        }
    }
}

public class EX4 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int i = 1; i <= 5; i++) {
            executor.submit(new PrintTask(i));
        }

        executor.shutdown();
    }
}

