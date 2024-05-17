const perfectNumberTs = (n: number): number => {
    let result: number = 1;
    for (let i: number = 2; i * i <= n; i++) {
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

console.log("perfect number", perfectNumberTs(6));
