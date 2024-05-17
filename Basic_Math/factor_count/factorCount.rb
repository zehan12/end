def factor_counts(n)
    factor = 0;
    i = 1
    while i * i <= n 
        if n % i == 0 
            factor += 1
            if i != n/i
                factor += 1
            end
        end
        i += 1
    end
    return factor
end

print "factor counts: ", factor_counts(36)