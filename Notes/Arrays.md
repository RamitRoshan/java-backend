## Java is a Strictly typed Language. 

- String in Java denoting " ".

- String in Java is Object type but in JavaScript it is a primitive data type and can be denoted using " " and ' ' .

- In Java, String length is a methods (name.length()). In JS String length is a property. (name.length)

- To get each character in a string("ramit"), we use **charAt()** methods in Java.

- WORA(Write Once, run anywhere) - It run Java Code anywhere with the help of JVM.



## public static void main(String[] args) — 

- public → JVM can access it from anywhere

- static → Class Method, No object needed; JVM calls it directly

- void → Returns nothing

- main → Program execution starts here (name of methods)

- String[] args → Command-line arguments (inputs at runtime)

#### In one line:
It is the entry point of a Java program where execution starts.


## What is starting point of java program ?
ans: it's a main method and it return nothing that's why it has void 
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




- String Default value is **Null**.
- Array Defualt value is **0**.

## Q). Why do we use Arrays.toString()?

In Java, arrays do NOT override toString().
So if you print an array directly, Java prints reference information, not values.


##### Arrays don’t override toString(), so printing an array shows its reference. Arrays.toString() is used to print actual elements.


Q). Why do we use new keyword in Java? <br>

ans:  new is used to create an object in memory (heap). <br>


### What new does internally

Q). When you write:

         Student s = new Student();


new:

Allocates memory in heap

Creates a new object

Calls the constructor

Returns the reference of the object

Why new is needed :

To create separate objects

To store instance variables

To access instance methods

To avoid using only references

Examples: 

     int[] arr = new int[5];  // memory allocated for array
     String s = new String("Java"); // new String object


Without new?
Student s;


❌ No object created, only reference → NullPointerException if used.


Note: 
The new keyword is used to allocate memory and create objects in Java.
## For-each loop (enhanced for loop)

```
public class MovieArr {
    public static void main(String[] args) { 
        //traditional approach of creating array
        String[] movies = new String[3];
        movies[0] = "F1";
        movies[1] = "F2";
        movies[2] = "F3";

        //enhanced for loop
        for(String movieName: movies){
            System.out.println("Name: " + movieName);
        }
    }
}
```