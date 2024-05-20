package main

import "fmt"

type Student struct {
	age  int
	name string
}

func (student *Student) setAge(age int) {
	student.age = age
}

func (student *Student) setName(name string) {
	student.name = name
}

func (student *Student) display() {
	fmt.Printf("My name is %s. I am %d years old\n", student.name, student.age)
}

func (student Student) sayHello(name string) {
	fmt.Printf("%s say hello to %s", student.name, name)
}

func main() {
	var s1 Student
	s1.setAge(25)
	s1.setName("zehan")
	s1.display()
	s1.sayHello("mhn")
}
