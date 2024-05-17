const factorCountTs = (n: number): number => {
    let factors = 0;
    const diviors: number[] = [];
    for (let i = 1; i * i <= n; i++) {
        if (n % i === 0) {
            factors += 1;
            diviors.push(i);
            if (i !== n / i) {
                factors += 1;
                diviors.push(n / i);
            }
        }
    }
    console.log(diviors);
    return factors;
};

console.log(factorCountTs(36));
