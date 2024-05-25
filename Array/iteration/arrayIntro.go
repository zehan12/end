package main

import "fmt"

func main() {

	// initialize static array with elements
	var arrayInt = [5]int{1, 2, 3, 4, 5}

	// initialize dynamic array with elements
	var sliceInt = []int{1, 2, 3, 4, 5}

	// iterating static array
	for i := 0; i < len(arrayInt); i++ {
		fmt.Println(arrayInt[i])
	}

	// iterating dynamic array
	for i := 0; i < len(sliceInt); i++ {
		fmt.Println(sliceInt[i])
	}
}
