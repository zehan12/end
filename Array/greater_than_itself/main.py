def greaterThanItself(arr):
    max = arr[0]
    count = 0
    for i in range(0,len(arr)):
        if max > arr[i]:
            count += 1
        if arr[i] > max:
            max = arr[i]
            count += 1
    return count

item1 = [-3, 2, 6, 8, 4, 8, 5 ]
item3 = [ 2, 5, 1, 4, 8, 0, 8, 1, 3, 8 ]
item2 = [8,8,8,8,8,8]

print("count: ",greaterThanItself(item1))
print("count: ",greaterThanItself(item2))
print("count: ",greaterThanItself(item3))