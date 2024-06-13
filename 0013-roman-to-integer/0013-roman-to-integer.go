func romanToInt(s string) int {
    var romanToIntMap = map[byte]int{
	'I': 1,
	'V': 5,
	'X': 10,
	'L': 50,
	'C': 100,
	'D': 500,
	'M': 1000,
    }
    
    result := 0
    for i := 0 ; i < len(s) ; i++ {
        if i + 1 < len(s) && romanToIntMap[s[i]] < romanToIntMap[s[i+1]] {
            result -= romanToIntMap[s[i]]
        } else {
            result += romanToIntMap[s[i]]
        }
    }
    return result
}