package main

import "fmt"

func pattern(x int) {
	for i := 1; i < x; i++ {
		for j := 1; j < i; j++ {
			fmt.Print(" ")
		}
		for k := 1; k <= x-i; k++ {
			fmt.Print("* ")
		}
		fmt.Println("")
	}
}

func main() {
	pattern(7)
}
