package com.wipro.basic;

public class EX12 {
    public static void main(String[] args) {
        int[] numbers = {100, 67, 98, 678, 45, 123};

        int largestNumber = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largestNumber) {
                largestNumber = numbers[i];
            }
        }
        System.out.println("The largest number in the array is: " + largestNumber);
    }
}
