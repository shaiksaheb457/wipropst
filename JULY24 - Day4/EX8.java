package com.wipro.exception;


import java.util.*;

class Employee {
    int empId;
    String empName;
    int empAge;

    public Employee(int empId, String empName, int empAge) {
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
    }

    @Override
    public String toString() {
        return empId + " - " + empName + " - " + empAge;
    }
}

class SortByEmpId implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return Integer.compare(e1.empId, e2.empId);
    }
}

class SortByEmpName implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return e1.empName.compareTo(e2.empName);
    }
}

class SortByEmpAge implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return Integer.compare(e1.empAge, e2.empAge);
    }
}

public class EX8 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(103, "John", 25));
        employees.add(new Employee(101, "Alice", 30));
        employees.add(new Employee(102, "Bob", 22));

        System.out.println("Sort by empId:");
        Collections.sort(employees, new SortByEmpId());
        for (Employee e : employees) {
            System.out.println(e);
        }

        System.out.println("\nSort by empName:");
        Collections.sort(employees, new SortByEmpName());
        for (Employee e : employees) {
            System.out.println(e);
        }

        System.out.println("\nSort by empAge:");
        Collections.sort(employees, new SortByEmpAge());
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
