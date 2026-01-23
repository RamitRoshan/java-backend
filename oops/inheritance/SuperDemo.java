package oops.inheritance;

public class SuperDemo {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Surya", "surya@gmail.com", "bangalore");
        //printing the class using normal methods
        s1.display();

        //printing class using toString method
        System.out.println(s1);
    }
}

//parent class
class Person{
    //field
    String name;
    String email;

    //parent constructor
    Person(String name, String email){  //parameter
        this.name = name;  //this.name refer to field and name refer to parameter 
        this.email = email;
    }
}

//child class / sub class
class Student extends  Person{
    int sId;
    String city;

    //child constructor
    Student(int sId, String name, String email, String city){
        super(name, email); // we call super so name and email calls first
        this.sId = sId;
        this.city  = city;
    }

    public void display(){
        System.out.println("sID=" + sId + ",name: "+ name + ",email :" + email + ",city: " + city);
    }


    //toString and display both works for same , just in toString we call like : System.out.println(s1);
    // and in display() - we call like : s1.display();
    @Override
    public String toString(){
        return  "[" + "sID=" + sId + ",name: "+ name + ",email :" + email + ",city: " + city + "]";
    }
}



//In the given Java code, what is the purpose of the super(name, email); call within the Student class constructor?
//D.It initializes the name and email fields of the Person class using the provided values.