package main

import "fmt"

func pattern(x int) {
	for i := 0; i < x; i++ {
		for j := 0; j <= i; j++ {
			fmt.Print("*")
		}
		fmt.Println("")
	}
}

func main() {
	pattern(6)
}
