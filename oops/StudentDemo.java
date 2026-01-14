package oops;

/*  Create a Student class :
      fields - id, name, email
      mathods - details

    Create 2 student objects
        - while creating the student object, pass the initial values
        - create a parameterized constrcutor  which will assign the values to the fields
        - after creating the object, call the details()   
*/
public class StudentDemo {
    public static void main(String[] args) {
        //create object

        //refering parameterized constructor
        Student s1 = new Student(1, "nathuram", "nathuramgodse@gmail.com");
        s1.details();

        // refering default constructor
        Student s2 = new Student();
        // s2.name = "Savarkar";
        s2.details();
    }
}

// class - creating blueprint
class Student{
    //fields
    int id;
    String name;
    String email;

    //Constructor overloading
    //default constructor
    Student() {}

    //parameterized constructor
    Student(int id, String name, String email){
        //this.id refer to fields and id refer to parameter of parameterized constructor
        this.id = id;
        this.name = name;
        this.email = email;
    }


    //when a method is called by an object it's called as an instance method
    public void details(){
        System.out.println("id : " + id);
        System.out.println("name : " + name);
        System.out.println("email : " + email);
    }
}
