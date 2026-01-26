package oops.polymorphism;

//protected -> child class should be able to access it
public class CustomerOverRide {
    public static void main(String[] args) {
        PrimeCustomer cust = new PrimeCustomer();
        cust.regularCustomer();
    }
}

class Customer {
    protected String name;
    protected String email;

    public void regularCustomer(){
        System.out.println("Delivering regular subsciption");
    }
}

class PrimeCustomer extends Customer{
    int startDate;
    int endDate;

    @Override
    public void regularCustomer(){
        System.out.println("Delivering prime subscription"); //Delivering prime subscription   
    }
}
