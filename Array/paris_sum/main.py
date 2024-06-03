def pairs(arr: list[int], k: int)-> bool:
    for i in range(0,len(arr)):
        for j in range(i,len(arr)):
            if ( arr[i] + arr[j] == k ):
                return True

arr = [3, 5, 2, 1, -3, 7, 8, 15, 6, 13]   
print(pairs(arr,10))