const perfectSquare  = (n) => {
    for ( let i = 0 ; i * i <= n ; i++ ) {
        if ( i * i === n ) {
            return i;
        }
    }
    return -1;
}

console.log("perfect square :",perfectSquare(25))