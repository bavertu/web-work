const myString = 'developer';

let myNewString;

// S1
myNewString = myString.charAt(0).toUpperCase() + myString.substring(1);

// S2
myNewString = myString[0].toUpperCase() + myString.slice(1);

// S3 
myNewString = myString[0].toUpperCase() + myString.substring(1);

// S4
myNewString = `${myString[0].toUpperCase()}${myString.substring(1)}`;


console.log(myNewString);