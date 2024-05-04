def isPalindromeNumber(n):
    digit = n
    reverse = 0
    while (n > 0):
        lastDigit = n % 10
        reverse = (reverse * 10) + lastDigit
        n = n // 10
    return reverse == digit

print(isPalindromeNumber(1234554321))