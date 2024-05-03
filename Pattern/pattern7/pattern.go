package main

import "fmt"

func pattern(x int) {
	for i := 0; i < x; i++ {
		for j := 0; j <= x-i; j++ {
			fmt.Print(" ")
		}

		for k := 0; k <= i; k++ {
			fmt.Print(" *")
		}

		fmt.Println()
	}
}

func main() {
	pattern(3)
}
