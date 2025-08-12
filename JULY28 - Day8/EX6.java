package com.wiproA.mockitodemo;

import java.util.*;
import java.util.stream.*;

public class EX6 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("John", 25, 40000),
            new Employee("Alice", 35, 60000),
            new Employee("Bob", 40, 70000),
            new Employee("Charlie", 20, 30000),
            new Employee("David", 38, 55000)
        );

        double averageSalary = employees.stream()
            .filter(e -> e.getAge() > 30 && e.getSalary() > 50000)
            .mapToDouble(Employee::getSalary)
            .average()
            .orElse(0.0);

        System.out.println("Average salary of employees (age > 30 and salary > 50000): " + averageSalary);
    }
}
