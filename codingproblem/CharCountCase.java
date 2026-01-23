package codingproblem;
public class CharCountCase {
    public static void main(String[] args) {
        /*Case in-sensitive comparision count . like when char = 'A' as well as 'a' 
        then count the a . for this I will use Character.toLowerCase() first then count
        */

        String str = "bAngalore";
        char ch = 'a';
        int count = 0;

        for(int i=0; i<str.length(); i++){
            if(Character.toLowerCase(str.charAt(i)) == ch){
                count++;
            }
        }
        System.out.println("total a's in " + str + " is: " + count);
    }
}
