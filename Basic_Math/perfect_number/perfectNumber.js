const perfectNumber = (n) => {
    let result = 1;
    for (let i = 0; i * i <= n; i++) {
        if (n % i === 0) {
            result += i;
            if (i !== n / i) {
                result += n / i;
            }
        }
    }
    if (result === n) return 1;
    return 0;
};

console.log("perfect number", perfectNumber(6));
