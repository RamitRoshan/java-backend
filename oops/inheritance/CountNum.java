package oops.inheritance;

//create one single object and throough inheritance it will get and sum
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


class One{
    int a = 10;
}

class Two extends One{
    int b = 5;
}

class Three extends Two{
    int c = 7;
}






 

