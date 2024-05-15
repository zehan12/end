def power(num, pow)
    result = 1
    while (pow > 0)
        if (pow % 2 == 1)
            result = result * num
        end
        num = num * num
        pow = pow / 2
    end
    return result
end 

print("power:",power(2,3))