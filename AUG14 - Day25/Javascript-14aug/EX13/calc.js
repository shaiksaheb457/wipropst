import { multiply, divide } from './operations.js';

const num1 = 10;
const num2 = 5;

document.body.innerHTML = `
    <h1>Multiplication: ${multiply(num1, num2)}</h1>
    <h1>Division: ${divide(num1, num2)}</h1>
    <h1>Division by Zero: ${divide(num1, 0)}</h1>
`;
