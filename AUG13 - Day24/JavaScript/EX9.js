let persons = [
    { name: "Mahir", age: 23, city: "Bangalore" },
    { name: "John", age: 17, city: "Delhi" },
    { name: "Priya", age: 30, city: "Mumbai" },
    { name: "Aman", age: 16, city: "Kolkata" },
    { name: "Neha", age: 25, city: "Chennai" }
];

for (let i = 0; i < persons.length; i++) {
    if (persons[i].age >= 18) {
        persons[i].status = "Adult";
    } else {
        persons[i].status = "Minor";
    }
}

let resultHTML = "";
for (let i = 0; i < persons.length; i++) {
    resultHTML += `${persons[i].name} (${persons[i].age}) - ${persons[i].city} - ${persons[i].status}<br>`;
}

document.getElementById("result").innerHTML = resultHTML;

console.log("Updated Persons List:", persons);
