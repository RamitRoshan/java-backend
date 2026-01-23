package oops.inheritance;

// Create a single object and through inheritance get all values and sum them.

public class CountNum {
    public static void main(String[] args) {
        // One obja = new One();
        // Two objb = new Two();
        // Three objc = new Three();
        // int sum = obja.a + objb.b + objc.c;
        // System.out.println(sum);


        //USing Single Object
        Three obj = new Three();   // single object
        int sum = obj.a + obj.b + obj.c;
        System.out.println("Sum of three class using single object: "+ sum);

    }
}

//parent class/base class/super class
class One{
    int a = 10;
}

// child class /Derived class/ sub class
class Two extends One{
    int b = 5;
}

class Three extends Two{
    int c = 7;
}




 

