package main

import "fmt"

func reverseNumber(n int) int {
	var lastDigit int = 0
	var reverse int = 0
	for n > 0 {
		lastDigit = n % 10
		n = n / 10
		reverse = (reverse * 10) + lastDigit
	}
	return reverse
}

func main() {
	fmt.Println("reverse number: ", reverseNumber(13456))
}
