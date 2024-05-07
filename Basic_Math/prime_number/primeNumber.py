def isPrime(n):
    if ( countFactor(n) == 2):
        return True
    return False

def countFactor(n):
    count = 0
    for i in range(1, int(n**0.5)+1):
        if ( n % i == 0 ):
            if ( n//i == i):
                count += 1
            else:
                count += 2
    return count

print("is prime: ",isPrime(2))