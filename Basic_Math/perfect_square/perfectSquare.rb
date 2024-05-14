def perfect_square(n)
    i = 1
    while i * i <= n do
      if i * i == n
        return i
    end
        i += 1
    end
    return -1
end


puts perfect_square(25)