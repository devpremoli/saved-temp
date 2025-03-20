/*****************************************Basics************************************************************/

// ---------------------------------------------------------------------------------------------------------

const word = ["spray", "elite", "exuberant", "destruction", "present"];

// Arrow functions implicitly return the expression right after =>, so you didn’t need a return statement

const filterWord = word.filter((e) => e.length > 6);
console.log("filterWord:", filterWord);

const mapWord = word.map((e) => e + " updated");
console.log("mapWord:", mapWord);

const findWord = word.find((e) => e.length > 6);
console.log("findWord: ", findWord);

// you must write return explicitly if your => is followed by a { curly brace

const filterWordA = word.filter((e) => {
  res = e.length > 6;
  return res;
});
console.log("filterWordA:", filterWordA);

// ---------------------------------------------------------------------------------------------------------

// ---------------------------------------------------------------------------------------------------------

// The callbackFn is called with the following arguments:
// element: The current element being processed in the array.
// index: The index of the current element being processed in the array.
//array: The array find() was called upon.

const numbers = [10, 20, 30];

const filterNumbers = numbers.filter(() => true);
console.log("filterNumbers: ", filterNumbers);

const filterNumbersA = numbers.filter((e) => e > 10);
console.log("filterNumbersA: ", filterNumbersA);

const result = numbers.filter((element, index, array) => {
  const cond = element > 15;
  if (cond) {
    console.log(`Element: ${element}, Index: ${index}, Array: ${array}`);
  }
  return cond;
});
console.log("result: ", result);

// ---------------------------------------------------------------------------------------------------------

// ---------------------------------------------------------------------------------------------------------

// thisArg
// define what the this keyword refers to inside the callbackFn
// particularly useful if your callbackFn relies on external data or context.

const threshold = { min: 10 };
const num = [5, 15, 20];
const filteredWithThisArg = num.filter(function (element) {
  return element > this.min; // 'this' refers to 'threshold'
}, threshold);
console.log("filteredWithThisArg: ", filteredWithThisArg);

// ---------------------------------------------------------------------------------------------------------

/*****************************************Basics************************************************************/
