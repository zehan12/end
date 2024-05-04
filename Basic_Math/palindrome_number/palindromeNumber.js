const palindromeNumber = (n) => {
  const digit = n;
  let lastDigit = 0;
  let reverse = 0;
  while (n > 0) {
    lastDigit = n % 10;
    reverse = reverse * 10 + lastDigit;
    n = parseInt(n / 10);
  }
  return reverse === digit;
};

console.log("palindrome number :", palindromeNumber(1234321));
