package main

import "fmt"

func pattern(x int) {
	for i := x; i >= 0; i-- {
		for j := 1; j <= i; j++ {
			fmt.Print("*")
		}
		fmt.Println("")
	}
}

func main() {
	pattern(8)
}
