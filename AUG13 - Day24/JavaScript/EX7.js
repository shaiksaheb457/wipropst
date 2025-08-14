let persons = [
    { name: "Mahir", age: 23, city: "Bangalore" },
    { name: "John", age: 17, city: "Delhi" },
    { name: "Priya", age: 30, city: "Mumbai" },
    { name: "Aman", age: 16, city: "Kolkata" },
    {name: "Saheb", age: 23, city: "Kadapa"}
];

let eligible = persons.filter(person => person.age >= 18);

let resultText = eligible.map(p => `${p.name} (${p.age}) - ${p.city}`).join("<br>");

document.getElementById("result").innerHTML = resultText;

console.log("Eligible Voters:", eligible);
