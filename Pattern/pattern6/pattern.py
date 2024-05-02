def pattern(x):
    for i in range(x):
        for j in range(1,x-i):
            print(j,end="")
        print("")

pattern(8)