def count_greater_than_itself(array)
    count = 0
    max = array[0]
    i = 1
    for i in 0...array.size
        if max > array[i]
            count += 1
        end
        if array[i] > max
            max = array[i]
            count += 1
        end
    end
return count
end

item1 = [-3, 2, 6, 8, 4, 8, 5 ];
item3 = [ 2, 5, 1, 4, 8, 0, 8, 1, 3, 8 ];
item2 = [8,8,8,8,8,8];

print("count: ",count_greater_than_itself(item1))
print("count: ",count_greater_than_itself(item2))
print("count: ",count_greater_than_itself(item3))