import java.util.Arrays;

public class Hello {
    public static void main(String[] args) {
        System.out.println("args :" + Arrays.toString(args)); //convert arrays to string
        System.out.println(args[0]);
        System.out.println("Hello world");
    }
}


/*
Run:
PS D:\dct-java-backend> javac Hello.java
PS D:\dct-java-backend> java Hello dct bangalore
args :[dct, bangalore]
dct
Hello world
 
*/

 


