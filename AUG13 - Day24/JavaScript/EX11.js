let date = new Date(2030, 7, 13); 
let days = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"];
let dayName = days[date.getDay()];

document.getElementById("result").innerText = "13 August 2030 will be a " + dayName;

console.log("13 August 2030 will be a " + dayName);
