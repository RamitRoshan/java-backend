public class Add {

//convert string to number we use Integer.parseInt

/*
create a Add class
define main()
while executing the Add class provide n inputs 10 20
or 10 20 30
the program should read the inputs and find the sum of the inputs.

java Add 10 20
*/
    public static void main(String[] args) {
        int sum = 0;

        //loop : using loop to command line arguments
        for(int i=0; i<args.length; i++){
            sum =  sum + Integer.parseInt(args[i]); //convert String -> int
        }
        System.out.println("Total Sum = " + sum);
    }
}


 

/*
Run:
PS D:\dct-java-backend> javac Add.java
PS D:\dct-java-backend> java Add 10 20
Total Sum = 30
 
*/

