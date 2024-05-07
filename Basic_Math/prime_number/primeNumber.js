const isPrime  = ( n ) =>  {
    if ( countFactor(n) === 2 ) return true;
    return false;
}

const countFactor = ( n ) => {
    let count = 0;
    for ( let i = 0 ; i * i <= n ; i++ ) {
        if ( n % i === 0 ) {
            if ( n / i === i ) {
                count++;
            } else {
                count += 2;
            }
        }
    }
    return count;
}

console.log("is prime: ",isPrime(2));