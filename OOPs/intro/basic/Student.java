public class Student {
    int age;
    String name;

    void display(){
        System.out.println("My name is "+ this.name + " I am "+ this.age + " years old");
    }

    void sayHello(String name){
        System.out.println(this.name + " says hello to " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.age = 25;
        s1.name = "zehan";
        s1.display();
        s1.sayHello("mhn");
    }
}
