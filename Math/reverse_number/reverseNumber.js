const reverseNumber = (n) => {
  let lastDigit;
  let reverse = 0;
  while (n > 0) {
    lastDigit = n % 10;
    n = parseInt(n / 10);
    reverse = reverse * 10 + lastDigit;
  }
  return reverse;
};

console.log("reverse number: ", reverseNumber(19999));
