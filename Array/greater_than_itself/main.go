package main

import "fmt"

func greaterThanItself(arr []int, n int) int {

	max := arr[0]
	count := 0

	for i := 1; i < n; i++ {
		if max > arr[i] {
			count++
		}
		if arr[i] > max {
			max = arr[i]
			count++
		}
	}

	return count
}

func main() {
	var items = []int{-3, 2, 6, 8, 4, 8, 5}
	var items2 = []int{2, 3, 10, 7, 3, 2, 10, 8}
	var items3 = []int{2, 5, 1, 4, 8, 0, 8, 1, 3, 8}
	var items4 = []int{8, 8, 8, 8, 8, 8, 8, 8}
	fmt.Println("count", greaterThanItself(items, len(items)))
	fmt.Println("count", greaterThanItself(items2, len(items2)))
	fmt.Println("count", greaterThanItself(items3, len(items3)))
	fmt.Println("count", greaterThanItself(items4, len(items4)))

}
