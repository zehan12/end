def perfect_number(n)
    result = 1
    i = 2
    while i * i < n
        if n%i == 0 
            result += i
            if i != n/i
                result += n/i
            end
        end
        i += 1
    end
    if result == n 
        return 1
    end
    return 0
end

print "perfect number :",perfect_number(6)