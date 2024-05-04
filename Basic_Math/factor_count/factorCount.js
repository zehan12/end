const factorCount = (n) => {
  let factorCount = 0;
  const divisors = [];
  for (let i = 1; i * i <= n; i++) {
    if ( n % i === 0 ) {
        if ( n/i === i ) {
            divisors.push(i);
            factorCount += 1;
        } else {
            divisors.push(i,n/i);
            factorCount += 2;
        }
    }
  }
  console.log(divisors);
  return factorCount;
};

console.log("factors counts :", factorCount(36));
