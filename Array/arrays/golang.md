# Arrays is Golang

#### Note :
- `len` is a built-in function that returns the number of items in an array of slice
- `cap` is a built-in function that returns the capacity of an array or slice. The capacity of an array is equal to it's length and the capacity of a slice is the maximum number of elements that the slice can hold before it needs to be resized (slice capacity may be greater than the length)

## Default Value

The zero value of an array in Go is an array with all elements set to the zero value for their respective types. For example, if you have an array of integers:

```go
var arr [5]int
```

The zero value of this array would be:

```go
[0, 0, 0, 0, 0]
```

Similarly, if you have an array of strings:

```go
var arr [5]string
```

The zero value of this array would be:

```go
["", "", "", "", ""]
```

In Go, the zero value of a slice is nil, which is a slice with a length of 0, a capacity of 0, and no underlying array. For example:

```go 
var slice []int
fmt.Println(slice == nil) // => true
```

## Differences
These are the differences between arrays and slices in the Go programming language.

- An array is a fixed-size data structure that stores a sequence of values of the same type. On the other hand, a slice is a variable-size data structure that references a portion of an array.

- An array is allocated with a specific size, which cannot be changed after creation. A slice, on the other hand, can be dynamically resized.

- An array is accessed using its index, while a slice is accessed using a range.

- An array is a value type, while a slice is a reference type.

- An array is passed by value to a function, while a slice is passed by reference.

- An array is declared using the [size]type syntax, while a slice is displayed using the []type syntax.

## Array
- An array in Go is a fixed-size data structure that stores elements of the same type.
- You need to specify the size of the array when you declare it.
- Once an array is defined, its size cannot be changed.
- Arrays are often used when you know the exact number of elements you need in advance.

### Declaring and initializing an array

The format for declaring arrays in Go is `var name [L]T`.
`var` is a keyword for declaring all kinds of variables in Go
`name` is the name of the variable, can be anything
`L` is the length of the array (must be a constant) and `T` is the type of the array items.
Let's look at some examples

```go
var numbers [5]int 
// An integer array with a fixed size of 5

numbers = [5]int{1, 2, 3, 4, 5}

numbers := [...]int{1, 2, 3, 4, 5} 
// Size calculated automatically

//Array of 5 Intergers
var nums [5]int
fmt.Println(nums) 
// => [0 0 0 0 0]

//Array of 10 strings
var strs [10]string
fmt.Println(nums) 
// => [         ]

// Nested arrays
var nested = [3][5]int{
    {1, 2, 3, 4, 5},
    {6, 7, 8, 9, 10},
    {11, 12, 13, 13, 15},
}
fmt.Println(nested) 
// => [[1 2 3 4 5] [6 7 8 9 10] [11 12 13 13 15]]
```

Initializing arrays is simply assigning a value to the variable
`var name = [L]T{...}` where `...` represents the array items of type `T`

```go
//Intializing an array containing 10 intergers
var nums = [10]int{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
fmt.Println(nums) // => [1 2 3 4 5 6 7 8 9 10]

//Intializing an array containing 10 strings
var strs = [10]string{"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"}
fmt.Println(strs) // => [one two three four five six seven eight nine ten]

//Nested arrays
var nested = [3][2]int{}
You can also create an array of structs
type Car struct {
    Brand string
    Color string
    Price float32
}

//Array of 5 items of type Car
var arrayOfCars = [5]Car{
    {Brand: "Porsche", Color: "Black", Price: 20_000.00},
    {Brand: "Volvo", Color: "White", Price: 8_000.00},
    {Brand: "Honda", Color: "Blue", Price: 7_000.00},
    {Brand: "Tesla", Color: "Black", Price: 50_000.00},
    {Brand: "Kia", Color: "Red", Price: 5_000.98},
}
fmt.Println(arrayOfCars) 
// => [{Porsche Black 20000} {Volvo White 8000} {Honda Blue 7000} {Tesla Black 50000} {Kia Red 5000.98}]
```

To create an array of items with different types in Go, you can use the `interface{}` type.

An interface in Go is a type that defines a set of methods that a type must implement. Any type that implements all of the methods listed in an interface is said to satisfy the interface and is considered to be of that interface type. The special interface type `interface{}` has no methods, which means that every type in Go satisfies this interface.

```go
package main

import "fmt"

func main() {
    //Array containing 5 items of different type
    var randomsArray = [5]interface{}{"Hello world!", 35, false, 33.33, 'A'}
    fmt.Println(randomsArray) // => [Hello world! 35 false 33.33 65]

}
```

Other ways of initializing arrays

```go
import "fmt"

func main() {
    // Using shorthand syntax
    cars := [3]string{"Tesla", "Ferrari", "Benz"}
    fmt.Println(cars) // => [Tesla Ferrari Benz]

    // Using ... inplace of array length
    digits := [...]int{10, 20, 30, 40}
    fmt.Println(digits) // => [10 20 30 40]

    // Using len keyword
    countries := [len(digits)]string{"China", "India", "Kenya"}
    fmt.Println(countries) // => [China India Kenya]
}
```

#### Note 
you can't use the `:=` shorthand syntax in global scope

### Iterating array

```go
arr := [5]int{1, 2, 3, 4, 5}
for i := 0; i < len(arr); i++ {
    fmt.Println(arr[i])
}
```

### Adding Items

Arrays have a fixed size, so you cannot dynamically add or remove elements from them. If your feature development requires operations like adding or removing elements, using slices would be much more appropriate.

### Updating Items

You can update items in an array by reassigning a new value to a specific index:

```go
arr := [5]int{1, 2, 3, 4, 5}
arr[2] = 10
```

### Deleting Items

Like adding items, you cannot directly delete items from an array. You may need to create a new array without the item you want to remove.


## Slice
- A slice, on the other hand, is a dynamically-sized, flexible view into the elements of an underlying array.
- Slices are created using the make() function or by slicing an existing array, another slice, or a string.
- Slices can grow or shrink as needed.
- Slices are more commonly used in Go because they provide greater flexibility when working with collections of data.

### Declaring and initializing an array

```go
var numbers []int 
// A slice with no fixed size, initially nil

numbers = []int{1, 2, 3, 4, 5} 
// Initialize the slice

arr := [5]int{1, 2, 3, 4, 5}

slice := arr[1:4] 
// This creates a slice containing elements at indices 1, 2, and 3 of the array
```

To declare a slice we use the format var name []int, the only difference between declaring arrays and slices is that with slices we omit the length.

Examples

```go
import "fmt"

func main() {
    // A slice of intergers
    var intSlice []int
    fmt.Println(intSlice) // => []

    // A slice of intergers
    var stringSlice []string
    fmt.Println(stringSlice) // => []
}
```

To initialize a slice in Go, you can use the make function. The make function takes three arguments: the type of the slice, the length of the slice, and the capacity of the slice (which is optional). make([]T, len, cap)

For example, to create a slice of integers with a length of 5 and a capacity of 10, you can use the following code:

```go
package main

import "fmt"

func main() {
    // With capacity
    slice1 := make([]int, 5, 10)
    fmt.Println(len(slice1), cap(slice1)) // => 5 10

    // Without capacity
    slice2 := make([]int, 5)
    fmt.Println(len(slice2), cap(slice2)) // => 5 5
}
```

When you omit the capacity, the capacity is set to the length of the slice.

You also initialize a slice without the make function by immediately assigning value to it

```go
slice := []int{1, 2, 3}
fmt.Println(len(slice), cap(slice)) // => 3 3
```

### Appending Items
You can add items to a slice using the append function. It dynamically resizes the slice to accommodate the new items:

```go
slice := []int{1, 2, 3}
slice = append(slice, 4, 5)
``` 

### Updating Items

To update an item in a slice, simply assign a new value to the slice at the desired index:

```go
slice := []int{1, 2, 3, 4, 5}
slice[2] = 10
```

### Deleting Items

You can delete an item from a slice by creating a new slice without the item you want to remove:

```go
slice := []int{1, 2, 3, 4, 5}
indexToDelete := 2
slice = append(slice[:indexToDelete], slice[indexToDelete+1:]...)
```

## Usage

- Arrays are used when the size of the data is known in advance and is not expected to change. This allows for efficient memory allocation and access. Examples include storing a list of student names or a deck of cards.

- Slices are used when the data size is not known in advance or is expected to change. This allows for more flexible and dynamic data manipulation. Examples include working with a subset of data from an array, such as the first ten elements, or dynamically adding and removing elements from a list.

