package main

import "fmt"

func countDigit(digit int) int {
	var count int = 0
	var lastDigit int
	for digit > 0 {
		lastDigit = digit % 10
		fmt.Println(lastDigit)
		digit = digit / 10
		count++
	}

	return count
}

func main() {
	fmt.Println("digit count:", countDigit(88838877777))
}
