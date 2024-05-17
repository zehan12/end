package main

import "fmt"

func sumOfNs(n int) int {
	return n * (n + 1) / 2
}

func main() {
	fmt.Println("sum of n :", sumOfNs(4))
}
