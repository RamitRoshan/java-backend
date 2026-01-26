package oops.polymorphism;

public class MethodOverload {

    /*
    Java support method overloading,
    having the same method name for different number parameters or diff. parameter type
    */
    public static int add(){
        return 0;
    }

    public static int add(int a, int b){
        return a+b;
    }

    public static int add(int a, int b, int c){
        return a + b + c;
    }

    public static String add(String a, String b){
        return a + b;
    }
    public static void main(String[] args) {
        int result0 = add();
        System.out.println(result0);

        int result1 = add(1,2);
        System.out.println(result1);

        int result2 = add(1,2, 3);
        System.out.println(result2);

        String result3 = add("Nathuram" , "Godse");
        System.out.println(result3);
    }
}
