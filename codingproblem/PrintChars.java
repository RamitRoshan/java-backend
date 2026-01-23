package codingproblem;
public class PrintChars {
    public static void main(String[] args) {
        String name = "Ramit";

        for(int i=0; i<name.length(); i++){
            System.out.println(name.charAt(i));
        }


        //printing the character in reversse order
        System.out.println("Printing the character of String in reverse order: ");
        for(int i=name.length()-1; i>=0; i--){
            System.out.println(name.charAt(i));
        }
    }
}
