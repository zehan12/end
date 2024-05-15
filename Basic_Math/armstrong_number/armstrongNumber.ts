const armstrongNumberTs = (n: number): number => {
    const digitCount = String(n).length;
    let result = 0;
    while (n > 0) {
        let lastDigit = n % 10;
        result += lastDigit ** digitCount;
        n = Math.floor(n / 10);
    }
    return result;
};

console.log("armstrong number :", armstrongNumberTs(1634));
