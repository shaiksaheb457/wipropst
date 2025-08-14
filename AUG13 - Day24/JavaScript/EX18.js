function calculate(operation) {
    let num1 = parseFloat(document.getElementById("num1").value);
    let num2 = parseFloat(document.getElementById("num2").value);
    let result = document.getElementById("result");

    if (isNaN(num1) || isNaN(num2)) {
        result.innerText = "Result: Please enter both numbers.";
        return;
    }

    let output;
    if (operation === "add") {
        output = num1 + num2;
    } else if (operation === "subtract") {
        output = num1 - num2;
    } else if (operation === "multiply") {
        output = num1 * num2;
    } else if (operation === "divide") {
        if (num2 === 0) {
            result.innerText = "Result: Cannot divide by zero.";
            return;
        }
        output = num1 / num2;
    }

    result.innerText = "Result: " + output;
}
