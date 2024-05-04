package main

import (
	"fmt"
	"math"
	"strconv"
)

func armstrongNumber(n int) bool {
	digitCount := len(strconv.Itoa(n))
	temp := n
	var result float64
	for temp > 0 {
		lastDigit := temp % 10
		result += math.Pow(float64(lastDigit), float64(digitCount))
		temp /= 10
	}
	return int(result) == n
}

func main() {
	fmt.Println("Armstrong number:", armstrongNumber(1634))
}
