package course;

// public class Main {
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         System.out.println(s1);
//         Instructor i1 = new Instructor();
//         System.out.println(i1);
//     }
// }

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1);
        s1.talk();
        s1.study();

        Instructor i1 = new Instructor();
        System.out.println(i1);
        i1.talk();
        i1.teach();
    }
}

class Person {
    String name;
    String email;

    public void talk(){
        System.out.println("Talking!!!");
    }
}

class Student extends Person{
    //via inheritance
    //String name;
    //String email;
    int sId;
    String city;

    public void study(){
        System.out.println("Studing!!!");
    }

    @Override //label
    public String toString(){
        return "Student[sId=" + sId + ",name=" + name + ",email=" + email + ",city=" + city + "]";
    }
}

class Instructor extends Person{
    //via inheritance
    //String name;
    //String email;
    int iId;
    String specialization;

    public void teach(){
        System.out.println("Teaching!!");
    }

    @Override
    public String toString(){
        return "Instructor[iId=" + iId + ",name=" + name + ",email=" + email + ",specialization=" + specialization + "]";
    }
}
