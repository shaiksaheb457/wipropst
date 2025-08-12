package com.wipro.bank;

import java.util.*;

public class EX13 {
    public static void main(String[] args) {
    	List<Integer> nums = Arrays.asList(10, 20, 30, 40);
    	int avg = (int) nums.stream().mapToInt(n -> n).average().orElse(0);
    	System.out.println(avg);  

    }
}
