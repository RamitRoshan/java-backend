package oops;

public class InstructorOops {
    public static void main (String[] args){

        Instructor i1 = new Instructor(1, "Arun", "arun@gmail.com", "Full stack");
        i1.details();

        // Instructor i1 = new Instructor();
        // i1.details();

        // i1.id = 1;
        // i1.name = "raj";
        // i1.email= "raj@gmail.com"
        // i1.specialization = "full stack";
        // i1.details();
    }
}


class Instructor {
    //fields
    int id;
    String name;
    String email;
    String specialization;

    //constructor
    // Instructor(){
    //     System.out.println("new instructor object created");
    // }

    //paramerterized construcotr (parameter name -> instructorId)
    Instructor(int id, String name, String email, String specialization){
        //when do we use this keywords -> when the parameter name is the same as the fieldname
        //this.id refer to field name and id is parameter of Instructor
        this. id = id;
        this.name = name;
        this.email = email;
        this.specialization = specialization;

        System.out.println("new instructor object created");
    }

    public void details(){
        System.out.println("id: " + id);
        System.out.println("name : " + name);
        System.out.println("email : " + email);
        System.out.println("specialization : " + specialization);
    }
}
