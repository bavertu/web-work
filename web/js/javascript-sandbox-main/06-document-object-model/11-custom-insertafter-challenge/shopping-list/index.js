function insertAfter(newEl, existingEl) {
    // Get the parent node of the existing element
    const parent = existingEl.parentNode;
  
    // Insert the new element after the existing element by using insertBefore
    // on the next sibling of the existing element.
    // If the existing element is the last child, existingEl.nextSibling will be null,
    // and insertBefore will work as appendChild in this case.
    parent.insertBefore(newEl, existingEl.nextSibling);
  }
  
  // New element to insert
  const li = document.createElement('li');
  li.textContent = 'Insert Me After!';
  
  // Existing element to insert after
  const firstItem = document.querySelector('li:first-child');
  
  // Our custom function
  insertAfter(li, firstItem);
  