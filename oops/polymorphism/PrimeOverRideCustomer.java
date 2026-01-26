package oops.polymorphism;

//protected -> child class should be able to access it
public class PrimeOverRideCustomer {
    public static void main(String[] args) {
        Prime p1 = new Prime();
        System.out.println(p1.getIsActive());
        p1.shipping();

        Regular c1 = new Regular();
        c1.shipping();
    }
}

class Customer {
    protected String name;
    protected String email;

    public void shipping(){
        System.out.println("Regular shipping");
    }
}

class Prime extends Customer{
    private boolean isActive = true;

    public boolean getIsActive(){
        return isActive;
    }

    @Override
    public void shipping(){
        if(isActive == true){
            System.out.println("Prime shipping");
        }
        else{ // based on the condition call the method in the parent class
            super.shipping();
        }
    }
}

class Regular extends Customer{

}
