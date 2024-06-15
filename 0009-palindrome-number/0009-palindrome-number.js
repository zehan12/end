/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    if ( x < 0 ) return false;
    let result = 0;
    let org = x;
    let lastDigit = 0;
    while ( x > 0 ) {
        lastDigit = x % 10;
        x = parseInt(x / 10);
        result = 10 * result + lastDigit;
    }
    if ( result === org ) {
        return true;
    }
    return false;
};