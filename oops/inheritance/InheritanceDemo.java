package oops.inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        A objA = new A();
        System.out.println(objA.a);

        B objB = new B();
        System.out.println(objB.b);
        System.out.println(objB.a);
    }
}


//parent class/base class
class A{
    String a = "A class";
}

//child class/ derived class
class B extends A {
    String b = "B class";
}

