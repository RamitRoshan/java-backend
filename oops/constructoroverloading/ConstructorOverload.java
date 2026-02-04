package oops.constructoroverloading;

//constructor overloading - diff. constructor for 
// different parameter list

public class ConstructorOverload {
    public static void main(String[] args) {
        User u1 = new User();
        System.out.println(u1.firstName); //null

        User u2 = new User("Sanu");
        System.out.println("FirstName: " + u2.firstName);

        User u3 = new User("Ramit", "Roshan");
        System.out.println(u3.firstName + " " + u3.lastName);
    }
}


class User{
    String firstName;
    String lastName;

    //default constructor
    User(){}

    //parameterized constructor
    User(String firstName){
        this.firstName = firstName;
    }

    //parameterized constructor with 2 parameters
    User(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
