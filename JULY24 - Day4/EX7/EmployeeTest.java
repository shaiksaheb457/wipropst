package com.wipro.exception;

import java.util.*;

public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("E101", "Mahir", 25, 55000));
        employees.add(new Employee("E102", "Amit", 30, 75000));
        employees.add(new Employee("E103", "Zara", 28, 62000));
        employees.add(new Employee("E104", "Neha", 27, 52000));

        System.out.println("Before Sorting:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        Collections.sort(employees);

        System.out.println("\nAfter Sorting by Salary (Ascending):");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
