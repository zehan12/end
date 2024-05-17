def divide_by_two(n)
    count = 0
    while n > 1
        n = n/2
        count += 1
    end
    return count
end

print "divide by two :",divide_by_two(20)