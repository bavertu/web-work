// const getCelsius = fahrenheit => ((fahrenheit - 32) * 5 / 9).toFixed(0);

// console.log(`The temperature is ${getCelsius(32)} \xB0C`);

// Challange 1
const getCelsius = (f) => ((f - 32) * 5) / 9;

console.log(`The temperature is ${getCelsius(32)} \xB0C`);


// Challange 2
// const minMax = arr => ({ min: Math.min(...arr), max: Math.max(...arr) });

function minMax(arr) {
    const min = Math.min(...arr);
    const max = Math.max(...arr);

    return {
        min,
        max,
    }
}

console.log(minMax([1, 2, 3, 4, 5]));


// Challange 3

// (function(length, width) {
//     const area = length * width;
//     console.log(`The are of a rectangle with a length of ${length} and a width of ${width} is ${area}.`);
// })(10, 5);

((length, width) => {
    const area = length * width;

    const output = `The area of a renctangle with a length of ${length} and a width of ${width} is ${area}.`;
    console.log(output);
})(20, 10);
