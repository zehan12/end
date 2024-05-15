# Sorting Task

```py
data = [22, 5, 34, 12, 90, 33] 

print(bubbleSort(array= data, ascending= True, steps= True))
```

## Output
```py
step 1:-
j = 0 : [22, 5, 34, 12, 90, 33] 
Swapping: 5 with 22
j = 1 : [5, 22, 34, 12, 90, 33] 
j = 2 : [5, 22, 34, 12, 90, 33] 
Swapping: 12 with 34
j = 3 : [5, 22, 12, 34, 90, 33] 
j = 4 : [5, 22, 12, 34, 90, 33]
Swapping: 33 with 90


step 2:-
j = 0 : [5, 22, 12, 34, 33, 90]
j = 1 : [5, 22, 12, 34, 33, 90]
Swapping: 12 with 22
j = 2 : [5, 12, 22, 34, 33, 90]
j = 3 : [5, 12, 22, 34, 33, 90]
Swapping: 33 with 34


step 3:-
j = 0 : [5, 12, 22, 33, 34, 90]
j = 1 : [5, 12, 22, 33, 34, 90]
j = 2 : [5, 12, 22, 33, 34, 90]


step 4:-
j = 0 : [5, 12, 22, 33, 34, 90]
j = 1 : [5, 12, 22, 33, 34, 90]

step 5:-
j = 0 : [5, 12, 22, 33, 34, 90]


step 6:-


[5, 12, 22, 33, 34, 90]
```

### The parameters which user can use while calling the functions are:

- array - The array of number is given as input.
- ascending - The order in which the array needs to sorted. Bydefault it is False i.e descending.
- steps - If working of sorting is need to be scene steps can be used. Bydefault it is False.