def pattern(x):
    for i in range(x):
        for j in range(i):
            print("*",end="")
        print()

pattern(6)