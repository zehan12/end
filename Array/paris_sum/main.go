package main

import "fmt"

func paris(arr []int, k int) bool {

	for i := 0; i < len(arr); i++ {
		for j := i; j < len(arr); j++ {
			if arr[i]+arr[j] == k {
				return true
			}
		}
	}
	return false
}

func main() {
	var arr = []int{3, 5, 2, 1, -3, 7, 8, 15, 6, 13}
	fmt.Println(paris(arr, 10))
}
