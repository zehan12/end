class Student {
    age;
    name;

    display() {
        console.log(`My name is ${this.name}. I am ${this.age} year old`);
    }

    sayHello(name) {
        console.log(`${this.name} says hello to ${name}`)
    }
}

const s1 = new Student();
s1.age = 25;
s1.name = "zehan";
s1.display();
s1.sayHello("mhn");
