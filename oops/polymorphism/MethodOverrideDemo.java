package oops.polymorphism;

public class MethodOverrideDemo {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}

class Parent{
    public void show(){
        System.out.println("Parent class");
    }
}

class Child extends Parent{
    @Override    //overriding the method from parent class
    public void show(){
        System.out.println("Child class");
    }
}
