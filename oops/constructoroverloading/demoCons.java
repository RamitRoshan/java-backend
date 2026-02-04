package oops.constructoroverloading;

public class demoCons {
    public static void main(String[] args) {
        Student s1 = new Student();

        Student s2 = new Student("Ramit");
        Student s3 = new Student("Ramit", 23);

        s1.display();
        s2.display();
        s3.display(); 
    }
}



class Student {

    String name;
    int age;

    // Constructor 1
    Student() {
        name = "Unknown";
        age = 0;
    }

    // Constructor 2
    Student(String name) {
        this.name = name;
        this.age = 0;
    }

    // Constructor 3
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name + " - " + age);
    }
}
