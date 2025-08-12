package com.wipro.bank;

import java.util.*;

public class EmpSort {
    public static void main(String[] args) {
        List<Emp> list = Arrays.asList(
            new Emp("Amit", 30),
            new Emp("Vasu", 25),
            new Emp("Jayanta", 28)
        );

        list.sort((e1, e2) -> e1.age - e2.age);

        System.out.println(list);
    }
}
