const sumArray = (numbers) => {
    return numbers.reduce((total, num) => total + num, 0);
};

const arr = [10, 20, 30, 40];
console.log(sumArray(arr)); 
