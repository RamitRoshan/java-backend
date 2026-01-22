package course;

public class Instructor extends Person {
    int iId;
    String specialization;

    public void teach() {
        System.out.println("Teaching!!!");
    }

    @Override
    public String toString() {
        return "Instructor[iId=" + iId + ", name=" + name + ", email=" + email + ", specialization=" + specialization + "]";
    }
}
