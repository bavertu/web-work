// // Solution 1
// function palindrome(str) {
//   const reserved = str.split('').reverse().join('');
//   return str == reserved;
// }

// Solution 2
function palindrome(str) {
  return str.split('').every((char, index) => {
    return char === str[str.length - index - 1];
  });
}

module.exports = palindrome;
