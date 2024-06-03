def result(n)
    if ( n > 0 )
        return 1
    elsif (n < 0)
        return -1
    else return 0
    end
    # return n > 0 ? 1 : n < 0 ? -1 : 0
end

puts result(9), result(0), result(-2)