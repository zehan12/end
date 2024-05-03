def countDigit(digit):
    count = 0
    while digit > 0:
        lastDigit = digit % 10
        print(lastDigit)
        digit = digit // 10
        count += 1
    return count

print("digit count: ",countDigit(44234))
        


