const diceImages = ["dice1.png", "dice2.png", "dice3.png", "dice4.png", "dice5.png", "dice6.png"];

const randomNumber1 = Math.floor(Math.random() * 6) + 1;
const randomNumber2 = Math.floor(Math.random() * 6) + 1;

const img1Element = document.querySelector(".img1");
const img2Element = document.querySelector(".img2");

img1Element.setAttribute("src", "/images/" + diceImages[randomNumber1 - 1]);
img2Element.setAttribute("src", "/images/" + diceImages[randomNumber2 - 1]);

//
const h1Element = document.querySelector("h1");

if (randomNumber1 > randomNumber2) {
    h1Element.innerHTML = "Player 1 Wins!";
} else if (randomNumber1 < randomNumber2) {
    h1Element.innerHTML = "Player 2 Wins!";
} else {
    h1Element.innerHTML = "It's a Draw!";
}