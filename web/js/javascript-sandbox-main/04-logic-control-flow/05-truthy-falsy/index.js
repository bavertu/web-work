// Falsy Values:
// - false
// - 0
// - "" or '' (Empty string)
// - null
// - undefined
// - NaN

const x = NaN;

if (x) {
    console.log('This is truty');
} else {
    console.log('This is flasy');
}

console.log(Boolean(x));

// Truty Values:
// - Everything else that is not falsy
// - true
// -'0' (in a string)
// - ' ' (space in a string)
// - 'false' (false in a string)
// - [] (empty array)
// - {} (empty object)
// - function () {} (empty function)

const y = function () {};

if (y) {
    console.log('This is truthy');
} else {
    console.log('This is falsy');
}

console.log(Boolean(y));

// Truty and falsy caveats
const children = 0;

if (!isNaN(children)) {
    console.log(`You have ${children} children`);
} else {
    console.log('Please enter number of children');
}

// Checking for empty arrays
const posts = ['Post One'];

if (posts.length > 0) {
    console.log('List Posts');
} else {
    console.log('No Posts To List');
}

// Checking for empty objects
const user = {
    name: 'Baver',
};

if (Object.keys(user).length > 0) {
    console.log('List User');
} else {
    console.log('No User');
}

// Loose Equality (==)
console.log(false === 0);
console.log('' === 0);
console.log(null === undefined);