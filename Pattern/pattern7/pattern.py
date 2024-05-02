def pattern(x):
    for i in range(x):
        for j in range(x-i):
            print(" ",end="")
        for k in range(i):
            print(" *",end="")
        print()

pattern(30)