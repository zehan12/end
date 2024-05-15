package main

import "fmt"

func power(num int, pow int) int {
	fmt.Println(num, pow)
	var result int = 1
	for pow > 0 {
		if pow%2 == 1 {
			result = result * num
		}
		num = num * num
		pow = pow / 2
	}
	return result
}

func main() {
	fmt.Println("power :", power(2, 3))
}
