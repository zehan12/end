const divideByTwoTs = (n: number): number => {
    let count: number = 0;
    while (n > 1) {
        n = Math.floor(n / 2);
        count++;
    }
    return count;
};

console.log("divide by two :", divideByTwoTs(20));
