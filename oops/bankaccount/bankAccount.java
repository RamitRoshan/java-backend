package oops.bankaccount;

public class bankAccount {
    public static void main(String[] args) {
        
        //creating two bankaccout
        BankAccount account1 = new BankAccount(1010, "Anil", 10000);
        BankAccount account2 = new BankAccount(2020,"Bablu", 5000);

        //Accout1 details
        account1.deposit(2000);
        account1.withdraw(5000);
        account1.displayAccoutDetails();

        //space
        System.out.println();

        //Account 2 details
        account2.deposit(5000);
        account2.withdraw(8000); 
        account2.displayAccoutDetails();
    }
}

class BankAccount{
    //fields
    int accountNumber;
    String accountHolderName;
    int balance;

    //parameterized constructor
    BankAccount(int accountNumber, String accountHolderName, int balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Deposit method
    public void deposit(int amount) {
        balance = balance + amount;
        System.out.println(amount + " deposited successfully" + ", and New balance: " + balance);
    }

    // Withdraw Method
    public void withdraw(int amount){
        //Deducts the amount from the balance if sufficient funds are available
        if(amount < balance){
            balance = balance - amount;
            System.out.println(amount + " withdraw successfully" + ", and New balance is: " + balance);

        }else{
            System.out.println("Insufficient balance available, withdraw failed!");
        }
    }

    //check balance
    public void checkBalance(){
        System.out.println("Displaying the current balance: " + balance);
    }

    //Display Account details
    public void displayAccoutDetails(){
        System.out.println("Account Number: "+ accountNumber);
        System.out.println("Account Holder name: " + accountHolderName);
        System.out.println("Current Balance is: " + balance);
    }
 
}
