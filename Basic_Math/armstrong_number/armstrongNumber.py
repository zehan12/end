def armstrongNumber(n):
    digitCount = len(str(n))
    temp = n
    result = 0;
    while ( temp > 0 ):
        lastDigit = temp % 10
        result += lastDigit ** digitCount
        temp = temp // 10
    return result == n

print("armstrong number :",armstrongNumber(1634))

