package oops.polymorphism;

//Instead of writting multiple Overloaded methods, Java Provides us var args using three dots (...)
public class MultiOverLoadMethod {
    public static void main(String[] args) {
        Math calc = new Math();
        System.out.println(calc.add(10, 20, 30, 40, 50, 60));
    }
}

class Math{
    public int add(int... args){
        int total = 0;
        for(int ele: args){
            total += ele;
        }
        return total;
    }
}
