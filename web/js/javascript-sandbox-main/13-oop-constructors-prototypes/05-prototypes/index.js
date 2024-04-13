function Rectangle(name, width, height) {
  this.name = name;
  this.weight = width;
  this.height = height;
  this.area = function () {
    return this.width * this.height;
  };
}

const rect = new Rectangle('Rect', 10, 10);

// Recrangle.prototype inherits from Object.prototype. that's wht we can use toString(), etc
console.log(rect.toString());

// To get the prototype of an object
console.log(Object.getPrototypeOf(rect));
