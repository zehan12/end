def perfectNumber(n):
    result = 1
    i = 2
    while i * i <= n:
        if n % i == 0:
            result += i
            if i != n//i:
                result += n//i
        i += 1
        if result == n:
            return 1
    return 0


print(perfectNumber(6))
# print(perfectNumber(4))