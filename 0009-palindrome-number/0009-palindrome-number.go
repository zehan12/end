func isPalindrome(x int) bool {
    if ( x < 0 ){
        return false
    }
    result := 0;
    original := x;
    value := 0;
    for x > 0 {
        value = x % 10;
        x = x / 10;
        result = 10 * result + value;
    }
    
    if ( result == original ) {
        return true;
    }
    return false;
}