package oops;

public class TestStudent {
    public static void main(String[] args) {
        //create object
        Student1 s1 = new Student1();
        //read the data
        System.out.println("id : " + s1.id);
        System.out.println("name : " + s1.name);
        System.out.println("email : " + s1.email);

        //write the data
        s1.id = 1;
        s1.name = "Ramit";
        s1.email = "ramit@gmail.com";

        //read the data
        System.out.println("id : " + s1.id);
        System.out.println("name : " + s1.name);
        System.out.println("email : " + s1.email);

    }
}

// class - creating blueprint
class Student1{
    //fields
    int id;
    String name;
    String email;
}
