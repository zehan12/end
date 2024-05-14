package main

import "fmt"

func perfectSquare(n int) int {
	for i := 1; i*i <= n; i++ {
		if i*i == n {
			return i
		}
	}
	return -1
}

func main() {
	fmt.Println("perfect Square", perfectSquare(25))
}
