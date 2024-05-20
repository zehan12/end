class Student:
    age = 0
    name = ""
    def display(self):
        print(f"My name is {self.name}. I am {self.age} year old")

    def sayHello(self, name):
        print(f"{self.name} say hello to {name}")


s1 = Student()
s1.age = 25
s1.name = "zehan"
s1.display()
s1.sayHello("mhn")