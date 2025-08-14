const cities = ["Mumbai", "Delhi", "Bangalore", "Chennai", "Kolkata", "Hyderabad", "Pune", "Ahmedabad"];

const loadCitiesBtn = document.getElementById("loadCitiesBtn");
const cityDropdown = document.getElementById("cityDropdown");

loadCitiesBtn.addEventListener("click", function() {
    const sortedCities = [...cities].sort();

    cityDropdown.innerHTML = '<option value="">-- Select a City --</option>';

    sortedCities.forEach(city => {
        const option = document.createElement("option");
        option.value = city;
        option.textContent = city;
        cityDropdown.appendChild(option);
    });
});
