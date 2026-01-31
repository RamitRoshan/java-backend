package oops.polymorphism;

/* Real-World Example: Payment System 💳📱
We create one reference type (Payment)
but at runtime we choose how to pay (UPI / Credit Card / Debit Card).
*/

public class PaymentDyncMtdDispt {
    public static void main(String[] args) {
        Payment payment;   // reference type

        payment = new UpiPayment();
        payment.pay();     // UPI payment

        payment = new CreditCardPayment();
        payment.pay();     // Credit card payment

        payment = new DebitCardPayment();
        payment.pay();     // Debit card payment
    }
}

class Payment {
    void pay() {
        System.out.println("Making payment");
    }
}

class UpiPayment extends Payment {
    @Override
    void pay() {
        System.out.println("Payment done using UPI");
    }
}

class CreditCardPayment extends Payment {
    @Override
    void pay() {
        System.out.println("Payment done using Credit Card");
    }
}

class DebitCardPayment extends Payment {
    @Override
    void pay() {
        System.out.println("Payment done using Debit Card");
    }
}
