# Array in ruby

## Creating arrays

Here are two basic arrays:

```ruby
num_array = [1, 2, 3, 4, 5]
str_array = ["This", "is", "a", "small", "array"]
```

Both arrays have five elements separated by commas. The first array contains integers, while the second array contains strings.

Arrays are commonly created with an array literal, which is a special syntax used to create instances of an array object. To create a new array using an array literal, use square brackets ([]).

An array can also be created by calling the Array.new method. When you call this method, you can also include up to 2 optional arguments (initial size and default value):

```ruby
Array.new               #=> []
Array.new(3)            #=> [nil, nil, nil]
Array.new(3, 7)         #=> [7, 7, 7]
Array.new(3, true)      #=> [true, true, true]
```

In Ruby we also have arrays, which are represented with square brackets and contain data of different types, each one related to an index. To create arrays we can simply do:

```ruby
# Creating an array typing a pair of square brackets
[]

# Creating an array through the .new method
Array.new
 => []
```

To make sure we are defining an array, we can simply use the .class method on a pair of square brackets:

```ruby
[].class
 => Array 
```

## Accessing array elements

Every element in an array has an index, which is a numerical representation of the element’s position in the array. Like most other programming languages, Ruby arrays use zero-based indexing, which means that the index of the first element is 0, the index of the second element is 1, and so on. Accessing a specific element within an array is done by calling my_array[x], where x is the index of the element you want. Calling an invalid position will result in nil. Ruby also allows the use of negative indices, which return elements starting from the end of an array, starting at [-1].

```ruby
str_array = ["This", "is", "a", "small", "array"]

str_array[0]            #=> "This"
str_array[1]            #=> "is"
str_array[4]            #=> "array"
str_array[-1]           #=> "array"
str_array[-2]           #=> "small"
```

Finally, Ruby provides the #first and #last array methods, which should be self-explanatory. In addition, these methods can take an integer argument, e.g., my_array.first(n) or my_array.last(n), which will return a new array that contains the first or last n elements of my_array, respectively.

```ruby
str_array = ["This", "is", "a", "small", "array"]

str_array.first         #=> "This"
str_array.first(2)      #=> ["This", "is"]
str_array.last(2)       #=> ["small", "array"]
```

Now let’s introduce some data into our array, assigning it to a local variable and then accessing each element of it:

```ruby
numbers_array = [1, 2, 3, 4]

numbers_array[0]
 => 1

numbers_array[1]
 => 2

```

We can access elements of an array with bracket notation, allowing us to pass the proper index of the element we want to get. As the index of an array starts with 0, for us to access the first element of the array — in this case the number “1” — we have to give it the 0 index.

Now imagine if we had a big array with so many elements and we would like to access the last one? We can do it:

```ruby
animals_array = ['elephant', 'cat', 'lion', 'penguin', 'tiger', 'bird', 'snake', 'monkey', 'crocodile', 'gorilla', 'hippopotamus', 'fish', 'zebra', 'giraffe']

animals_array[animals_array.length - 1]
 => "giraffe"
But we can still make it simpler:

animals_array[-1]
 => "giraffe"
Passing the -1 in bracket notation, will give us access to the last element of an array.

Another common situation is if we want to update an element of an array, without having to write a new one. Let’s update the third element of an array:

desserts_array = ["Cookies", "Ice cream", "Chocolate cake"]

desserts_array[2] = "Apple pie"

desserts_array
 => ["Cookies", "Ice cream", "Apple pie"]
```

In this case the 3rd element of the desserts_array is the one with index 2, so we pass the index inside the pair of square brackets to access it.

Ruby has a lot of methods for manipulating arrays and checking its values that come in handy. You can check these methods doing:

```ruby
[].methods
 => [:to_h, :include?, :&, :*, :+, :-, :at, :fetch, :last, :union, :difference, :intersection, :push, :append, :pop, :shift, :unshift, :each_index, :join, :rotate, :rotate!, :sort!, :sort_by!, :collect!, :map!, :select!, :filter!, :keep_if, :values_at, :delete_at, :delete_if, :reject!, :transpose, :fill, :assoc, :rassoc, :uniq!, :compact, :compact!, :flatten, :flatten!, :shuffle!, :shuffle, :sample, :permutation, :combination, :repeated_permutation, :repeated_combination, :product, :bsearch, :sort, :bsearch_index, :deconstruct, :count, :find_index, :select, :filter, :reject, :collect, :map, :first, :all?, :any?, :one?, :none?, :minmax, :|, :reverse_each, :zip, :take, :take_while, :drop, :<=>, :<<, :cycle, :drop_while, :==, :sum, :uniq, :[], :[]=, :insert, :empty?, :eql?, :index, :rindex, :replace, :clear, :max, :min, :inspect, :length, :size, :each, :reverse, :concat, :prepend, :reverse!, :to_ary, :to_a, :to_s, :pack, :delete, :slice, :slice!, :dig, :hash, :each_slice, :each_cons, :each_with_object, :chunk, :slice_before, :slice_after, :slice_when, :chunk_while, :to_set, :chain, :lazy, :find, :entries, :sort_by, :grep, :grep_v, :detect, :find_all, :filter_map, :flat_map, :collect_concat, :inject, :reduce, :partition, :group_by, :tally, :min_by, :max_by, :minmax_by, :member?, :each_with_index, :each_entry, :dup, :itself, :yield_self, :then, :taint, :tainted?, :untaint, :untrust, :untrusted?, :trust, :frozen?, :methods, :singleton_methods, :protected_methods, :private_methods, :public_methods, :instance_variables, :instance_variable_get, :instance_variable_set, :instance_variable_defined?, :remove_instance_variable, :instance_of?, :kind_of?, :is_a?, :tap, :class, :display, :singleton_class, :clone, :public_send, :method, :public_method, :singleton_method, :define_singleton_method, :extend, :to_enum, :enum_for, :===, :=~, :!~, :nil?, :respond_to?, :freeze, :object_id, :send, :__send__, :!, :!=, :__id__, :equal?, :instance_eval, :instance_exec] 
```

The list of methods is long, but in the next topic I will be giving you some of the most used methods in arrays.

## Adding and removing elements

Adding an element to an existing array is done by using the #push method or the shovel operator <<. Both methods will add elements to the end of an array and return that array with the new elements. The #pop method will remove the element at the end of an array and return the element that was removed.

```ruby
num_array = [1, 2]

num_array.push(3, 4)      #=> [1, 2, 3, 4]
num_array << 5            #=> [1, 2, 3, 4, 5]
num_array.pop             #=> 5
num_array                 #=> [1, 2, 3, 4]
```

The methods #shift and #unshift are used to add and remove elements at the beginning of an array. The #unshift method adds elements to the beginning of an array and returns that array (much like #push). The #shift method removes the first element of an array and returns that element (much like #pop).

```ruby
num_array = [2, 3, 4]

num_array.unshift(1)      #=> [1, 2, 3, 4]
num_array.shift           #=> 1
num_array                 #=> [2, 3, 4]
It’s also useful to know that both #pop and #shift can take integer arguments:

num_array = [1, 2, 3, 4, 5, 6]

num_array.pop(3)          #=> [4, 5, 6]
num_array.shift(2)        #=> [1, 2]
num_array                 #=> [3]
```

## Common array methods
Consider the desserts_array for the examples. If you use any destructive methods, please refer to the dessert_array again.


```ruby
desserts_array = ["Cookies", "Ice cream", "Chocolate cake", "Apple pie"]

# Returns last element
desserts_array.last
 => "Apple pie"

# Returns first element
desserts_array.first
 => "Cookies" 

# Returns the first n elements, passing the n argument inside the parenthesis
desserts_array.take(2)
 => ["Cookies", "Ice cream"]

# Removes last element of an array destructively, returning the removed element
desserts_array.pop
 => "Apple pie" 

desserts_array
 => ["Cookies", "Ice cream", "Chocolate cake"]

# Removes first element of an array destructively, returning the removed element
desserts_array.shift
 => "Cookies"

desserts_array
 => ["Ice cream", "Chocolate cake", "Chocolate cake"] 

# Check if an element is present
desserts_array.include?("Cookies")
 => true 

# Reverse elements in an array non destructively
desserts_array.reverse
 => ["Apple pie", "Chocolate cake", "Ice cream", "Cookies"]

desserts_array
 => ["Cookies", "Ice cream", "Chocolate cake", "Apple pie"]
```

Although the examples above don’t include all of the existing Ruby array methods, we can already have a good set of tools for manipulating arrays in Ruby applications.

Adding array elements destructively
Let’s check a few more examples that will let us add elements to an array:

```ruby
desserts_array = ["Cookies", "Ice cream", "Chocolate cake"]


# Adding element to the end of an array destructively
desserts_array.push("Fruits")
 => ["Cookies", "Ice cream", "Chocolate cake", "Fruits"]

desserts_array
 => ["Cookies", "Ice cream", "Chocolate cake", "Fruits"]

# Adding element to beggining of an array destructively
desserts_array.unshift("Brownie")
 => ["Brownie", "Cookies", "Ice cream", "Chocolate cake"]

desserts_array
 => ["Brownie", "Cookies", "Ice cream", "Chocolate cake"]
```

## Accessing array elements within a range
We can also check elements’ values within a certain index range. Let’s suppose we want to get from the 3rd until the 5th elements of an array:

```ruby
numbers_array = [1, 2, 3, 4, 5, 6]

numbers_array[2..4]
 => [3, 4, 5]
```

As we saw earlier in this post, arrays start with the index 0, which represents the first element of an array. So for us to be able to access the 3rd until the 5th elements, we need to pass into the bracket notation — used to access an element inside an array — the indexes of 2 and 4.

Notice that we did something a little bit different this time when accessing our elements. We used ‘..’ to tell Ruby to give us the elements within a range of indexes 2 and 4, including the 2 and 4 indexes elements. Another way to access ranges, would be with the ‘…’ operator:

```ruby
numbers_array = [1, 2, 3, 4, 5, 6]

numbers_array[2...4]
 => [3, 4]
```

The difference between ‘..’ and ‘…’ is that the last one will return the elements within a range, but not including the last element.

To wrap up this post there’s one more method in Ruby arrays I’d like to mention, called ‘shovel’. It is represented by ‘<<’ that inserts elements into an array. The shovel does basically the same thing as push:

```ruby
numbers_array = [1, 2, 3, 4, 5, 6]

numbers_array << 7
 => [1, 2, 3, 4, 5, 6, 7]

numbers_array
 => [1, 2, 3, 4, 5, 6, 7] 
```