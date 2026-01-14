package functions;

public class Add {

    public static int Addition(int a, int b){ 
        return a + b;
    }
    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;
        
        int sum = Addition(a, b);
        System.out.println( "Sum is: " + sum);
    }
}
