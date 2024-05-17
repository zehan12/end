const divideByTwo = (n) => {
    let count = 0;
    while(n > 1) {
        n = parseInt(n/2);
        count++;
    }
    return count;
}

console.log("divide by two",divideByTwo(20));