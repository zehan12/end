package main

import "fmt"

func factorCount(n int) int {
	var factorCount = 0
	divisors := []int{}
	for i := 1; i*i <= n; i++ {
		if n%i == 0 {
			if n/i == i {
				divisors = append(divisors, i)
				factorCount += 1
			} else {
				divisors = append(divisors, i, n/i)
				factorCount += 2
			}
		}
	}
	fmt.Println(divisors)
	return factorCount
}

func main() {
	fmt.Println("factors counts :", factorCount(36))
}
