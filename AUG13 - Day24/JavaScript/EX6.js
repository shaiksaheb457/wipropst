let names = ["Deva", "Leo", "Vikram", "Santhanam", "dilli", "rolex"];
let filteredNames = names.filter(name => name.length > 5);
let upperCaseNames = filteredNames.map(name => name.toUpperCase());
console.log("Original Names:", names);
console.log("Filtered & Uppercase Names:", upperCaseNames);
document.getElementById("result").innerText = upperCaseNames.join(", ");
