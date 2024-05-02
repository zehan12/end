def pattern(x):
    for i in range(x+1):
        for j in range(i):
            print(i,end="")
        print("")

pattern(5)