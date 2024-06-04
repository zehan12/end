def paris(arr,k)
    for i in 0...arr.size
        for j in i+1...arr.size
            if arr[i] + arr[j] == k
                return true
            end
        end
    end
    return false
end

arr = [3, 5, 2, 1, -3, 7, 8, 15, 6, 13]
print paris(arr,4)