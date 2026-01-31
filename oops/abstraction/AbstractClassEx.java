// package oops.abstraction;

// public class AbstraclClassEx {
//     public static void main(String[] args) {
//         // Animal a = new Animal();
//         // a.makeSound();
//         Animal a = new Dog("Sheru");
//     }
// }
// //cannot be instantiated -> no object of that class can be created(where we  declare class as abstract)
// abstract class Animal {
//     //but they can have attributes, methods , constructors
//     String name;
//     Animal(String name){
//         this.name = name;
//     }
//     public void makeSound(){
//         System.out.println("Animal is making sound");
//     }
// }
// class Dog extends Animal{
//     //constructor
//     Dog(String name){
//         super(name);
//     }
//     //makeSound is overridden
//     @Override
//     public void makeSound(){
//         System.out.println("Bark");
//     }
// }
// class Cat extends Animal{
//     @Override
//     public void makeSound(){
//         System.out.println("Meow");
//     }
// }


package oops.abstraction;

public class AbstractClassEx {
    public static void main(String[] args) {

        //Animal a is a reference type and new Dog("Sheru");is a object type.
        Animal a = new Dog("Sheru");
        a.makeSound(); //Bark
        a.sleep(); //Sleeping  

        Animal b = new Cat("Kitty");
        b.makeSound();  //Meow
    }
}

// Abstract class
abstract class Animal {

    String name;

    // Constructor
    Animal(String name) {
        this.name = name;
    }

    /* abstract method - method without a body
    sub class should implement the method -> the logic
    of the method should be written in the subclass.
    */

    // Abstract method (forces child classes to implement)
    abstract void makeSound();


    //concrete method
    public void sleep(){
        System.out.println("Sleeping");
    }
}

// Dog class
class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

// Cat class
class Cat extends Animal {

    //constructor
    Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}
