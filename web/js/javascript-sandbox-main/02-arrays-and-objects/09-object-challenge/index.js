// Step 1

const library = [
    {
        title: 'The Great Gatsby',
        author: 'F. Scott Fitzgerald',
        status: {
            own: true,
            reading: false,
            read: false
        }
    },
    {
        title: '1984',
        author: 'George Orwell',
        status: {
            own: true,
            reading: false,
            read: false
        }
    },
    {
        title: 'To Kill a Mockingbird',
        author: 'Harper Lee',
        status: {
            own: true,
            reading: false,
            read: false
        }
    }
];

// Step 2

// for (let i = 0; i < library.length; i++) {
//     library[i].status.read = true;
// }
library[0].status.read = true;
library[1].status.read = true;
library[2].status.read = true;


// Step 3
const { title } = library[0];

// Step 4
const libraryJSON = JSON.stringify(library);

console.log(libraryJSON);
