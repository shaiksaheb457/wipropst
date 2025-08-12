package com.wipro.exception;

public class Employee implements Comparable<Employee> {
    private String empId;
    private String empName;
    private int empAge;
    private double empSalary;

    public Employee(String empId, String empName, int empAge, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
        this.empSalary = empSalary;
    }

    public String getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    // Setters
    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return empId + " - " + empName + " - Age: " + empAge + " - Salary: ₹" + empSalary;
    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.empSalary, other.empSalary);
        
    }
}
