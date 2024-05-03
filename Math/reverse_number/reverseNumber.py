def reverseNumber(n):
    reverse = 0
    while(n > 0):
        lastDigit = n % 10
        n = n // 10
        reverse = (reverse * 10) + lastDigit
    return reverse

print("reverse number:", reverseNumber(1399))