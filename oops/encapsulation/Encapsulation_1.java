package oops.encapsulation;

// Setter and Getter 

public class Encapsulation_1 {
    public static void main(String[] args) {
        Student s1 = new Student(11, "abhishekji", "abhishekji@gmaill.com");
        System.out.println(s1); // will get output

        // will get error, as we are trying to get the id-data from outside of classes
        // System.out.println(s1.id);

        //id, name and email is private and we can access it within the class to get out of it we use getter method
        System.out.println(s1.getId());
        System.out.println(s1.getName());
        System.out.println(s1.getEmail());

        //setter-> update the name
        s1.setName("Ramit");
        System.out.println(s1);

        //update email id
        s1.setEmail("ramitsroshan@gmail.com");
        System.out.println(s1);


        //when length of name is 0
        try{
            s1.setName("");
        }catch(IllegalArgumentException e){
            System.out.println("Error : " + e.getMessage());
        }
    }
}

class Student {
    //fields
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

    //getter(reader) method -> to get the id, as it is private
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }

    //Setter method(update) - writer (it also should be public)
    //naming convention - setFieldname(paramType paramName){}
    // public void setName(String name){  //we create obj, so we won't use static, it's a instance method
    //     this.name = name;
    // }

    //when length of string is 0
    public void setName(String name){ 
        if(name.trim().length() == 0){
            throw new IllegalAccessError("name is required");
        }
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email; //use this bcz field and input parameter is same, so to differentiate we use
    }
 
    @Override
    public String toString(){
        return "Student[id =" + id + ", name=" + name + ", email=" + email + "]";
    }
}

