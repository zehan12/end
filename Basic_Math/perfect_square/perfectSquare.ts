const perfectSquareTs = (n: number): number => {
    for (let i = 1; i * i <= n; i++) {
        if (i * i === n) {
            return i;
        }
    }
    return -1;
}

console.log("perfect square :", perfectSquareTs(25));