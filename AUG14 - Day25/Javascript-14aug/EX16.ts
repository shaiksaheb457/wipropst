interface Employee {
    empId: number;
    empName: string;
    salary: number;
}

function printEmployees(employees: Employee[]): number {
    console.log("Employee List:");
    employees.forEach(emp => {
        console.log(`ID: ${emp.empId}, Name: ${emp.empName}, Salary: ${emp.salary}`);
    });

    return employees.length; 
}

let employeeList: Employee[] = [
    { empId: 101, empName: "John", salary: 50000 },
    { empId: 102, empName: "Alice", salary: 55000 },
    { empId: 103, empName: "Bob", salary: 60000 }
];

let count = printEmployees(employeeList);
console.log("Total Employees:", count);
