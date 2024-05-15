def armstrong_number(n)
    digitCount = n.to_s.length
    result  = 0
    while ( n > 0 ) 
        lastDigit = n % 10
        result += lastDigit ** digitCount
        n = n / 10
    end
    return result
end

print "armstrong number :", armstrong_number(1634)
