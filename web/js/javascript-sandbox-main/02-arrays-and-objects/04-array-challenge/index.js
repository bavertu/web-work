// Sol1
const arr = [1, 2, 3, 4, 5];
arr.reverse(); // reverses the array to [5, 4, 3, 2, 1]
arr.unshift(6); // adds 6 at the beginning
arr.push(0); // adds 0 at the end

console.log(arr); // [6, 5, 4, 3, 2, 1 ,0];

// Sol 2
const arr1 = [1, 2, 3, 4, 5];
const arr2 = [5, 6, 7 ,8 ,9, 10];

//Combine arrays
let arr3 = arr1.concat(arr2);
arr3.splice(arr1.length, 1); // removes the extra 5 which is located at the index position of the kength of arr1

// //another sol
// let arr3 = [...arr1, ...arr2.slice(1)];


console.log(arr3); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]