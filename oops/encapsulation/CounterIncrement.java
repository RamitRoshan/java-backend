package oops.encapsulation;

public class CounterIncrement {
    public static void main(String[] args) {
        Counter c1 = new Counter(0);

        System.out.println("Count: " + c1.getCount());
        System.out.println("INC: ");
        c1.inc();
        c1.inc();
        c1.inc();

        System.out.println("Count: " + c1.getCount());
        System.out.println("DEC: ");
        c1.dec();

        System.out.println("Count: " + c1.getCount());
        System.out.println("Reset: ");
        c1.reset();

        System.out.println("Count: " + c1.getCount());
        System.out.println("INC by: ");
        c1.incBy(121);
        System.out.println("Count: " + c1.getCount());
    }
}

class Counter{
    private int count;

    //constructor
    Counter(int count){
        this.count = count;
    }

    public int getCount(){
        return this.count; //return count
    }

    public void inc(){
        count  = count + 1;
    }
     public void dec(){
        count  = count - 1;
    }

    public void reset(){
        count = 0;
    }

    public void incBy(int n){
        count = count+ n;
    }
}
