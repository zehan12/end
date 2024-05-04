package main

import "fmt"

func isPalindromeNumber(n int) bool {
	digit := n
	var lastDigit int = 0
	var reverse int = 0
	for n > 0 {
		lastDigit = n % 10
		reverse = (reverse * 10) + lastDigit
		n = n / 10
	}
	return reverse == digit
}

func main() {
	fmt.Println("Is Palindrome Number: ", isPalindromeNumber(12345654321))
}
