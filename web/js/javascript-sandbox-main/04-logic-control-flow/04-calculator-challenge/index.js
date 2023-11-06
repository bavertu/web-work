function calculator(num1, num2, operator) {
    switch(operator) {
        case '+':
            return num1 + num2;
        case '-':
            return num1 - num2;
        case '*':
            return num1 * num2;
        case '/':
            if(num2 === 0) {
                return "Division by zero is not allowed!";
            }
            return num1 / num2;
        default:
            return "Invalid operator!";
    }
}

// Testing the function
console.log(calculator(5, 2, '+'));  // returns 7
console.log(calculator(5, 2, '-'));  // returns 3
console.log(calculator(5, 2, '*'));  // returns 10
console.log(calculator(5, 2, '/'));  // returns 2.5
console.log(calculator(5, 2, '&'));  // returns "Invalid operator!"
console.log(calculator(5, 0, '/'));  // returns "Division by zero is not allowed!"