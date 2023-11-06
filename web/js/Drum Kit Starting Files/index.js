const buttons = document.querySelectorAll("button");

buttons.forEach(button => {
  button.addEventListener('click', function() {
    var soundPath = this.getAttribute('data-sound');
    var audio = new Audio(soundPath);
    audio.play();

    // Add the "pressed" class to the button to trigger the animation
    this.classList.add('pressed');

    // Remove the "pressed" class after a short delay to reset the button appearance
    setTimeout(() => {
      this.classList.remove('pressed');
    }, 100);

    // Remove the "pressed" class from all buttons after a short delay
    setTimeout(() => {
      buttons.forEach(b => b.classList.remove('pressed'));
    }, 100);
  });
});

const keySoundMap = {
  'w': 'sounds/tom-1.mp3',
  'a': 'sounds/tom-2.mp3',
  's': 'sounds/tom-3.mp3',
  'd': 'sounds/tom-4.mp3',
  'j': 'sounds/snare.mp3',
  'k': 'sounds/crash.mp3',
  'l': 'sounds/kick-bass.mp3'
};

// Function to play the audio for a given key
function playSound(key) {
  const soundPath = keySoundMap[key];
  if (soundPath) {
    const audio = new Audio(soundPath);
    audio.play();

    // Add the "pressed" class to the corresponding button to trigger the animation on key press
    const button = document.querySelector(`button[data-sound="${soundPath}"]`);
    if (button) {
      button.classList.add('pressed');

      // Remove the "pressed" class from all buttons after a short delay
      setTimeout(() => {
        buttons.forEach(b => b.classList.remove('pressed'));
      }, 100);
    }
  }
}

// Add a keyboard event listener to the document
document.addEventListener('keydown', function(event) {
  const key = event.key;
  playSound(key);
});
