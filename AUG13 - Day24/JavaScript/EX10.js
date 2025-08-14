let persons = [
    { name: "Mahir", age: 23, city: "Bangalore" },
    { name: "John", age: 17, city: "Delhi" },
    { name: "Priya", age: 30, city: "Mumbai" },
    { name: "Aman", age: 16, city: "Kolkata" },
    { name: "Neha", age: 25, city: "Chennai" }
];

let updatedPersons = persons.map(p => ({
    ...p,
    status: p.age >= 18 ? "Adult" : "Minor"
}));

document.getElementById("result").innerHTML = updatedPersons
    .map(p => `${p.name} (${p.age}) - ${p.city} - ${p.status}`)
    .join("<br>");

console.log(updatedPersons);
