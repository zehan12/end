package main

import "fmt"

func result(n int) int {
	if n > 0 {
		return 1
	} else if n < 0 {
		return -1
	} else {
		return 0
	}
}

func main() {
	fmt.Println(result(0))
	fmt.Println(result(1))
	fmt.Println(result(-1))

}
