package oops.encapsulation;

//Code of Getter and Setter 
public class Encapsulation_2 {
    public static void main(String[] args) {
        Student s1 = new Student(11, "abhishekji", "abhishekji@gmaill.com");

        // Prints object -> internally calls s1.toString()
        System.out.println(s1); // will get output (Student[id =11, name=abhishekji, email=abhishekji@gmaill.com])

        // will get error, as we are trying to get the id-data from outside of classes
        // System.out.println(s1.id);

        //Accessing private data using getter methods
        //id, name and email is private and we can access it within the class to get out of it we use getter method
        System.out.println(s1.getId()); //print id
        System.out.println(s1.getName()); //print name
        System.out.println(s1.getEmail()); //print email
 

        //setter-> update the name

        // Updating ONLY the name field using setter
        // Email is NOT changed yet
        s1.setName("Ramit");
        // Printing object after name update
        // Output shows updated name but OLD email
        System.out.println(s1);



        //update email id

         // Now updating the email field
        s1.setEmail("ramitsroshan@gmail.com");
        // Printing object after email update
        // Output shows updated name AND updated email
        System.out.println(s1);
    }
}

class Student {
    //fields
    // Private fields → cannot be accessed directly outside the class
    private int id;
    private String name;
    private String email;


    //parameterizzed constructor
    Student(int id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }

    //naming convention - getField()

    //getter(reader) method -> read private data
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }

    //Setter method(update)   → update private data
    //naming convention - setFieldname(paramType paramName){}
    public void setName(String name){  //we create obj, so we won't use static, it's a instance method
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email; //use this bcz field and input parameter is same, so to differentiate we use
    }
 
    // toString() is automatically called when object is printed
    @Override
    public String toString(){
        return "Student[id =" + id + ", name=" + name + ", email=" + email + "]";
    }
}
