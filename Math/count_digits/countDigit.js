const digitCount = (digit) => {
  let count = 0;
  let lastDigit;
  while (digit > 0) {
    lastDigit = digit % 10;
    console.log(lastDigit);
    digit = parseInt(digit / 10);
    count++;
  }
  return count;
};

console.log("digit count:", digitCount(48832838923489));
