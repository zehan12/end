const armstrongNumber = (n) => {
  const digitCount = String(n).length;
  let temp = n;
  let result = 0;
  let lastDigit;
  while (temp > 0) {
    lastDigit = temp % 10;
    result += lastDigit ** digitCount;
    temp = parseInt(temp / 10);
  }
  return result === n;
};

console.log(armstrongNumber(1634));
