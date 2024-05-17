package main

import "fmt"

func dividByTwo(n int) int {
	count := 0
	for n > 1 {
		n = n / 2
		count++
	}
	return count
}

func main() {
	fmt.Println("divide by two", dividByTwo(20))
}
