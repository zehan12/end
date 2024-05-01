// declare with new key word
const arr = new Array();
console.log(arr);

for (let i = 0; i < 10; i++) {
  arr[i] = i + 1;
}
console.log(arr);

// dynamic array
const numbers = [1, 2, 3, 4, 5, 6];

console.log(numbers);

// insert value at starting
const insertIndex = 0;
const insertValue = 10;

// shifting to right
for (let i = numbers.length; i > insertIndex; i--) {
  numbers[i] = numbers[i - 1];
}

// update the index
numbers[insertIndex] = insertValue;

console.log(numbers);

const matrix = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9],
];

for (let i = 0; i < matrix.length; i++) {
  for (let j = 0; j < matrix[i].length; j++) {
    console.log(matrix[i][j]);
  }
}

console.log(matrix)
