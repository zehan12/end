class Student
  # Class variables should be accessed using attr_accessor or similar methods
  @@age = 0
  @@name = ""

  # Define a setter method for name
  def name=(value)
    @@name = value
  end

  def age=(value)
    @@age = value
  end

  def display
    puts("My name is #{@@name}. I am #{@@age} year old")
  end

  def say_hello(name)
    puts("#{@@name} say hello to #{name}")
  end

end

s1 = Student.new
# Set the name using the setter method
s1.name = "zehan"
s1.age = 25
s1.display()
s1.say_hello("mhn")

