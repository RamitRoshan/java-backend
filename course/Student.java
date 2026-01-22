package course;

public class Student extends Person {
    int sId;
    String city;

    public void study() {
        System.out.println("Studying!!!");
    }

    @Override
    public String toString() {
        return "Student[sId=" + sId + ", name=" + name + ", email=" + email + ", city=" + city + "]";
    }
}

