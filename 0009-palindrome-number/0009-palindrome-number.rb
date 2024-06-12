# @param {Integer} x
# @return {Boolean}
def is_palindrome(x)
    if x < 0 
        return false
    end
    result = 0
    original = x
    value = 0
    while x > 0 
        value = x % 10
        x = x / 10
        result = result * 10 + value
    end
    if result == original
        return true
    end
    return false
end