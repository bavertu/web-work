// Generate random numbers for x and y
let x = Math.floor(Math.random() * 100 ) + 1; // between 1 and 100
let y = Math.floor(Math.random() * 50) + 1; //between 1 and 50

// Calculate results for various operations
let sum = x + y;
let difference = x - y;
let product = x * y;
let quotient = x / y;
let remainder = x % y;

// Generate output strings using template literals
let sumOutput = `${x} + ${y} = ${sum}`;
let differenceOutput = `${x} - ${y} = ${difference}`;
let productOutput = `${x} * ${y} = ${product}`;
let quotientOutput = `${x} / ${y} = ${quotient}`;
let rmOutput = `${x} % ${y} = ${remainder}`;

// Log the output strings
console.log(sumOutput);
console.log(differenceOutput);
console.log(productOutput);
console.log(quotientOutput);
console.log(rmOutput);