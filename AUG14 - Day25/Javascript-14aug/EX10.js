function sumNumbers(...nums) {
    return nums.reduce((total, num) => total + num, 0);
}

console.log(sumNumbers(1, 2, 3));       
console.log(sumNumbers(5, 10, 15, 20));