def pattern(x):
    for i in range(x):
        for j in range(i):
            print(" ",end="")
        for k in range(x-i):
            print("* ",end="")
        print()
    return

pattern(6)