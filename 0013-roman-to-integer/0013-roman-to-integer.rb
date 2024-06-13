def roman_to_int(s)
  # Mapping of Roman numerals to their integer values
  roman = {'I' => 1, 'V' => 5, 'X' => 10, 'L' => 50, 'C' => 100, 'D' => 500, 'M' => 1000}
    result = 0
    for i in 0...s.size
        if ( i + 1  < s.size and roman[s[i]] < roman[s[i+1]] ) 
            result -= roman[s[i]]
        else
            result += roman[s[i]]
        end
    end
    return result
end
# def roman_to_int(s)
#   # Mapping of Roman numerals to their integer values
#   values = {'I' => 1, 'V' => 5, 'X' => 10, 'L' => 50, 'C' => 100, 'D' => 500, 'M' => 1000}
  
#   # Initialize the total sum
#   sum = 0
  
#   # Initialize the value of the first Roman numeral
#   prev_value = values[s[0]]
  
#   # Iterate through each subsequent character in the input string
#   (1...s.length).each do |i|
#     # Get the integer value of the current Roman numeral
#     current_value = values[s[i]]
    
#     # If the current value is greater than the previous value, subtract the previous value
#     # Otherwise, add the previous value
#     sum += current_value > prev_value ? -prev_value : prev_value
    
#     # Update the previous value for the next iteration
#     prev_value = current_value
#   end
  
#   # Add the last value to sum
#   sum + prev_value
# end