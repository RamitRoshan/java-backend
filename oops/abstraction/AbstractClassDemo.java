package oops.abstraction;

//Abstraction using Abstract Class

public class AbstractClassDemo {
    public static void main(String[] args) {
        Bank b = new SBI();// abstraction + polymorphism
        b.rateOfInterest();  //SBI Interest Rate: 6%
        b.branch(); //Bank has branches
        
    }
}


//parent class 
abstract class Bank {
    abstract void rateOfInterest(); // abstract method

    void branch(){
        System.out.println("Bank has branches");
    }
}

//child class
class SBI extends Bank {
    @Override
    void rateOfInterest() {
        System.out.println("SBI Interest Rate: 6%");
    }
}




/*
What is happening here? (Very Important)

Bank hides implementation

SBI provides implementation

Method call decided at runtime

This is abstraction + runtime polymorphism
*/