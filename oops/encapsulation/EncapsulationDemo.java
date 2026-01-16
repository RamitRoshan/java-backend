package oops.encapsulation;

public class EncapsulationDemo {
    public static void main(String[] args) {
        Student s1 = new Student(1, "ravi", "ravi@gmaill.com");
        System.out.println(s1);
    }
}

class Student {
    //fields
    int id;
    String name;
    String email;


    //parameterizzed constructor
    Student(int id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    } 

    // We are **overriding** the inbuilt `toString()` method from the Object class.
   // This allows us to define how a Student object should be represented as a String.
  // Since `toString()` is an **instance method**, we do not use `static` here., also we create object so we cannot write static.
    @Override
    public String toString(){
        return "Student[id =" + id + ", name=" + name + ", email=" + email + "]";
    }
}
