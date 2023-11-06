// // Value is stored in the stack
// const name = 'John';
// const age = 30;

// // Reference is stored in the heap
// const person = {
//   name: 'Brad',
//   age: 40,
// };

// let newName = name;
// newName = 'Jonathan';

// let newPerson = person;
// newPerson.name = 'Bradley';

// console.log(name, newName); // John, Jonathan
// console.log(person, newPerson); // { name: 'Bradley', age: 40 }, { name: 'Bradley', age: 40 }


// Values are stored on the stack
const name = 'John';
const age = 30;

// References values are stored on the heap
const person = {
  name: 'Brad',
  age: 40,
};

let newName = name;
newName = 'Johnathan';

let newPerson = person;
newPerson.name = 'Bradley';


console.log(name, newName);
console.log(person, newPerson);