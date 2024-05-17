package main

import "fmt"

func perfectNumber(n int) int {
	result := 1
	for i := 2; i*i <= n; i++ {
		if n%i == 0 {
			result += i
			if i != n/i {
				result += n / i
			}
		}
	}
	if result == n {
		return 1
	}
	return 0
}

func main() {
	fmt.Println("perfect number: ", perfectNumber(6))
}
