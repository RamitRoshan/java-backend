package oops.inheritance;

/*
create a person class with the following fields

name - accessible from anywhere
age - accessible in child
aadhar - not accessible in child

Create a Employee class which extends Person
Fields of employee
eId - accessible from anywhere
salary = accessible form anywhere

in Main class
Create an employee object
Employee e1 = new Employee(pass the arguments);
e1.details(); //should display the details of the employee like the eId - name -age - aadhar - salary


=> Private 
    private members are accessible only inside the same class.
    They are NOT accessible in child classes.

=> Protected
    protected members are accessible in the same package
    and in child classes through inheritance.
*/

public class EmployeePersonExample {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "john", 25, "IND1234", 40000);
        e1.details();
    }
}

class Person{
    //field
    public String name;
    protected int age;
    private String aadhar;

    //parent constructor
    Person(String name, int age, String aadhar){
        this.name = name;
        this.age = age;
        this.aadhar = aadhar;
    }

    //get method to get the aadhar
    public String getAadhar(){
        return aadhar;
    }
}

class Employee extends Person{
    public int eId;
    public double salary;

    //child construtor
    Employee(int eId, String name, int age, String aadhar, double salary){
        //super keyword
        super(name, age, aadhar);
        this.eId = eId;
        this.salary = salary;
    }


    public void details(){
        System.out.println("eID=" + eId + ",name: "+ name + ",age :" + age + ",aadhar: " + getAadhar() + ",salary: " + salary);
    }
}
