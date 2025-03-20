console.log(Object.getPrototypeOf(Array)); // ƒ () { [native code] }
console.log(Array.prototype); // [at: ƒ, concat: ƒ, copyWithin: ƒ, fill: ƒ, find: ƒ, …]

Array.prototype.first = function() {
    return this[0];
};

console.log(Array.prototype); // [first: ƒ, at: ƒ, concat: ƒ, copyWithin: ƒ, fill: ƒ, …]
  