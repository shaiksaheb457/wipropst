package com.wipro.exception;

import java.util.concurrent.CopyOnWriteArrayList;

class Employees {
    int empId;
    String empName;
    double salary;

    public Employees(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return empId + " - " + empName + " - " + salary;
    }
}

public class EX9 {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Employees> employees = new CopyOnWriteArrayList<>();

        employees.add(new Employees(101, "Alice", 75000));
        employees.add(new Employees(102, "Bob", 90000));
        employees.add(new Employees(103, "Charlie", 80000));
        employees.add(new Employees(104, "David", 95000));

        System.out.println("Before removal:");
        for (Employees e : employees) {
            System.out.println(e);
        }

        for (Employees e : employees) {
            if (e.salary > 80000) {
                employees.remove(e);
            }
        }

        System.out.println("\nAfter removal:");
        for (Employees e : employees) {
            System.out.println(e);
        }
    }
}
