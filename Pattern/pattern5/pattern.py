def pattern(x):
    for i in range(x,0,-1):
        for j in range(i):
            print("*",end="")
        print()
        
    for i in range(x):
        for j in range(x-i):
            print("*", end="")
        print()

pattern(10)