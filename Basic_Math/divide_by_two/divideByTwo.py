def divideByTwo(n):
    count = 0
    while n > 1:
        n = n // 2
        count += 1
    return count

print("divide by two",divideByTwo(20))