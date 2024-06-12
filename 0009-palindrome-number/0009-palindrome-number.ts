function isPalindrome(x: number): boolean {
    if ( x < 0 ) return false;
    let result:number = 0;
    let val = x;
    let f:number = 1;
    while ( x > 0 ) {
         let v = x % 10;
         x = parseInt(String(x / 10));
         result = 10 * result + v
        console.log(v,x,result)
    }

    if ( result === val ) {
        return true;
    }
    return false;
};