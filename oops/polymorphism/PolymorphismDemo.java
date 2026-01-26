package oops.polymorphism;

//Driver class or main class
public class PolymorphismDemo {
    public static void main(String[] args) {
        Math calc = new Math();
        System.out.println(calc.add(2, 3));
        System.out.println(calc.add(2, 3, 5));
    }
}


class Math{

    //Method overloading
    public int add(int a, int b){
        return a+ b;
    }
    public int add(int a, int b, int c){
        return a + b + c;
    }

}
