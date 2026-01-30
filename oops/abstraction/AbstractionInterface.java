package oops.abstraction;

public class AbstractionInterface {
    public static void main(String[] args) {
        Payment p = new UpiPayment();
        p.pay(); //Payment done using UPI
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
