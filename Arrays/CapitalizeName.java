package arrays;

/* Capitalize the NamesCreate a method that takes an array of names and returns an array where 
only the first letter of each name is capitalized.
Examples : 
capMe(["mavis", "senaida", "letty"]) ➞ ["Mavis", "Senaida", "Letty"]
capMe(["samuel", "MABELLE", "letitia", "meridith"]) ➞ ["Samuel", "Mab
elle", "Letitia", "Meridith"]
*/
public class CapitalizeName {

    public static String[] capMe(String[] names){
 
        for(int i=0; i<names.length; i++){
            names[i] = Character.toUpperCase(names[i].charAt(0)) 
            + names[i].substring(1);
        }
        return names;
    }
    public static void main(String[] args) {
        String[] nam = {"mavis", "senaida", "letty"};

        String[] result = capMe(nam);

        // we use a loop to print arrays because Java cannot print array elements automatically.
        for(String s: result){
            System.out.print(s + ", ");
        }
    }
}
