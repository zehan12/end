package main

import "fmt"

func pattern(x int) {
	for i := 1; i <= x; i++ {
		for j := 1; j <= i; j++ {
			fmt.Print(j)
		}
		fmt.Println("")
	}
}

func main() {
	pattern(7)
}
