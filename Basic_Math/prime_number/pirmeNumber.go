package main

import "fmt"

func isPrime(n int) bool {
	if countFactor(n) == 2 {
		return true
	}
	return false
}

func countFactor(n int) int {
	var count = 0
	for i := 1; i*i <= n; i++ {
		if n%i == 0 {
			if n/i == i {
				count++
			} else {
				count += 2
			}
		}
	}
	return count
}

func main() {
	fmt.Println("is prime number: ", isPrime(7))
}
