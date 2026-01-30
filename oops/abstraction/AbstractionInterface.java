package oops.abstraction;

public class AbstractionInterface {
    public static void main(String[] args) {
        Payment p = new UpiPayment();
        p.pay(); //Payment done using UPI+
    }
}

interface Payment {
    void pay();
}

//Implementing Class
class UpiPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Payment done using UPI");
    }
}


/*
interface is a blueprint of class and it is partially correct bcz
without class we cannot make a object but without interface we can make classes.
*/