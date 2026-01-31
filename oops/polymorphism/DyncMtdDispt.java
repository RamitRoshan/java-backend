package oops.polymorphism;

//Examples of Dynamic Method Dispatch
public class DyncMtdDispt {
    public static void main(String[] args) {
        // Dog myDog = new Dog();
        // myDog.makeSound();

        // Cat myCat = new Cat();
        // myCat.makeSound();

        /*Dynamic method dipatch/ late binding
        decision to execute is taken at run time based
        on the actual object type and not the 
        reference type.
        */
       //Dynamic method dispatch
       Animal a;
       a = new Dog();
       a.makeSound(); //Bark

       a = new Cat();
       a.makeSound();  //Meow
    }
}

class Animal {
    public void makeSound(){
        System.out.println("Animal is making sound");
    }
}

class Dog extends Animal{
    //makeSound is overridden
    @Override
    public void makeSound(){
        System.out.println("Bark");
    }
}

class Cat extends Animal{

    @Override
    public void makeSound(){
        System.out.println("Meow");
    }
}
