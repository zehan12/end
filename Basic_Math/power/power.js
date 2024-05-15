const power  = (num, pow) => {
    let result = 1;
    while ( pow > 0 ) {
        if ( pow % 2 == 1 ) {
            result = result * num;
        }
        num = num * num;
        pow = parseInt(pow / 2);
    }
    return result;
}

console.log("power",power(2,3));