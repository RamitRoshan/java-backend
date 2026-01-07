## Java is a Strictly typed Language. 

- String in Java denoting " ".

- String in Java is Object type but in JavaScript it is a primitive data type and can be denoted using " " and ' ' .

- In Java, String length is a methods (name.length()). In JS String length is a property. (name.length)

- To get each character in a string("ramit"), we use **charAt()** methods in Java.

- WORA(Write Once, run anywhere) - It run Java Code anywhere with the help of JVM.



## public static void main(String[] args) — 

- public → JVM can access it from anywhere

- static → No object needed; JVM calls it directly

- void → Returns nothing

- main → Program execution starts here

- String[] args → Command-line arguments (inputs at runtime)

#### In one line:
It is the entry point of a Java program where execution starts.



# REPL

Q). What is REPL? <br>
ans: REPL is an interactive programming environment that reads code, executes it, prints the result, and repeats. 

**REPL = Read–Eval–Print–Loop**

##### It is an interactive environment where:

- Read → you type code

- Eval → the system executes it

- Print → shows the result

- Loop → waits for next input

🔹 Examples

JavaScript → Browser Console, Node.js

Python → Python shell

Java → JShell

SQL → DB console


=> **Note:** we write JShell in terminal to write and execute java code in terminal. <br>
JShell is Java’s REPL where we can execute Java statements interactively without writing a full program.

🔹 Why REPL is useful

- Quick testing
- Learning concepts
- Debugging small logic
- No need to write full programs


Ex:

     jshell> int a = 10;
     a ==> 10

     jshell> a * 2
     $2 ==> 20


- Primitive data type don't have properties and methods.
- Primitive data types are immutables. (i.e it doesnot change).
- Java is Case-sensitive language.
- Every primitive data type has an equivalent class.
- toLowerCase() is a instance methods.



## Q) Difference between Static and Instance methods in Java?

### Answer:

### 🔹 Instance Method
- Belongs to an **object**
- Requires **object creation**
- Can access **instance and static members**

**Example: `String.toLowerCase()`**
```java
String s = "JAVA";
String result = s.toLowerCase(); // instance method
System.out.println(result);
``` 

### 🔹 Static Method

- Belongs to the class

- No object required

- Can access only static members

**Example: Character.toLowerCase()**

```
char ch = 'A';
char result = Character.toLowerCase(ch); // static method
System.out.println(result);
```

- Called using class name

- Does not depend on object state

### 🧠 Key Difference (One-line)

Instance methods need an object, static methods belong to the class and are called using the class name.

## 📌 Quick Comparison : 


       Instance Method	      Static Method 
       Needs object	          No object needed
       Called using object 	  Called using class 
       Works on object data   Works on provided data


- For-loop => It is used, when we know the numbers of iteration to execute.
- While-loop => when we don't know the number of iterations we performs.


## Here are some classic Two Pointers array problems:

Two Sum II (Sorted Array) – find two numbers with given sum

Remove Duplicates from Sorted Array

Move Zeros to End

Container With Most Water

Trapping Rain Water (Optimized)

Dutch National Flag Problem (sort 0,1,2)

Minimum Size Subarray Sum

Squares of a Sorted Array (merge two pointers)

Reverse Array / Subarray

Longest Subarray with Sum K
