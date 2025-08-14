let employees = [
    { name: "Mahir", role: "Manager", empId: 101, salary: 80000 },
    { name: "John", role: "Developer", empId: 102, salary: 60000 },
    { name: "Priya", role: "Manager", empId: 103, salary: 90000 },
    { name: "Aman", role: "QA", empId: 104, salary: 55000 },
    { name: "Neha", role: "Manager", empId: 105, salary: 75000 }
];

let totalManagerSalary = employees
    .filter(emp => emp.role === "Manager")
    .reduce((total, emp) => total + emp.salary, 0);

document.getElementById("result").innerText = "Total Salary (Managers): ₹" + totalManagerSalary;

console.log("Total Manager Salary:", totalManagerSalary);
    