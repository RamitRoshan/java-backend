package oops;


public class StudentDemoBasic {
    public static void main(String[] args) {
        Student s2 = new Student();

        //read the data
        s2.details();

        //write the data
        s2.id = 1;
        s2.name = "Ramit";
        s2.email = "ramit@gmail.com";

        //read the data
        s2.details();
    }
}

class Student{
    //fields
    int id;
    String name;
    String email; 

    /* here we are creating object so we cannot declare method like
    public static void details();
    we can do this when are not creating an object
    */
    //when a method is called by an object it's called as an instance method
    public void details(){
        System.out.println("id : " + id);
        System.out.println("name : " + name);
        System.out.println("email : " + email);
    }
}
