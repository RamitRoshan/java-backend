package oops.abstraction;

public class InterfaceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound(); //bark
    }
}

interface Animal {
    public void makeSound(); //abstract maathod
}

class Dog implements Animal{
    public void makeSound(){
        System.out.println("Bark");
    }
}
