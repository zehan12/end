def perfectSquare(n):
    for i in range(int(n**0.5) + 1):
        if (i*i == n):
            return i
    return -1

def perfectSquareList(n):
    return next((i for i in range(int(n**0.5) + 1) if i*i == n), -1)

print(perfectSquare(25))
print(perfectSquareList(4))