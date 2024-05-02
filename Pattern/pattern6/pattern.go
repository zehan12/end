package main

import "fmt"

func pattern(n int) {
	for i := 0; i < n; i++ {
		for j := 1; j <= n-i; j++ {
			fmt.Print(j)
		}
		fmt.Println("")
	}
}

func main() {
	pattern(5)
}
