package com.wipro.basic;

import java.util.Scanner;

public class EX7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        double num = sc.nextDouble();
        
        System.out.println("Input value: " + num);
        
        if (num == 0) {
            System.out.println("zero");
        } else {
            if (num > 0) {
                System.out.print("positive");
            } else {
                System.out.print("negative");
            }
            
            double absNum = Math.abs(num);
            if (absNum < 1) {
                System.out.print(" and small");
            } else if (absNum > 1000000) {
                System.out.print(" and large");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
