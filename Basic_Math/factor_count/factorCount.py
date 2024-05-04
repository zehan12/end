def factorCount(n):
    factorCount = 0
    divisors = []
    for i in range(1, int(n**0.5) + 1):
        if ( n % i == 0 ):
            if ( n/i == i ):
                divisors.append(i)
                factorCount += 1
            else:
                divisors.append(i)
                divisors.append(int(n/i))
                factorCount += 2
    print(divisors)
    return factorCount

print("factors counts: ",factorCount(36))