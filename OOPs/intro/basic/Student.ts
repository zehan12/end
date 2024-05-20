class StudentTs {
    age: number = 0;
    name: string = "";

    display(): void {
        console.log(`My Name is ${this.name}. I am ${this.age} year old`)
    }

    sayHello(name: string): void {
        console.log(`${this.name} say hello to ${name}`);
    }
}

const s1 = new StudentTs();
s1.age = 25;
s1.name = "zehan";
s1.display();
s1.sayHello("mhn");
