def perfectSquare(n):
    # Iterate through numbers up to the square root of n
    for i in range(int(n**0.5) + 1):
        # Check if i*i equals n
        if i*i == n:
            return i  # Return the square root if it's a perfect square
    return -1  # Return -1 if it's not a perfect square

def perfectSquareList(n):
    return next((i for i in range(int(n**0.5) + 1) if i*i == n), -1)

def perfectSquareP(A):
    sqrt = int(A ** 0.5)  # Calculate the square root of A
    if (sqrt * sqrt )== A:  # Check if the square of the square root equals A
        return sqrt  # Return the square root if it's a perfect square
    return 1  # Return 1 if it's not a perfect square

print(perfectSquare(25))
print(perfectSquareList(25))
print(perfectSquareP(25))