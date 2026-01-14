package arrays;

/*  Match the Last ItemCreate a function that takes an array of items and checks if the last item 
matches the rest of the array concatenated together.
Examples: 
matchLastItem(["i", "love", "tesh", "ilovetesh"]) ➞ true
// The last item is the rest joined.

matchLastItem(["i", "am", "into", "her", "world", "iamintoherworld"]) ➞ true
// The last item is the rest joined.

matchLastItem(["1", "1", "1", "11"]) ➞ false
// The last item should be "111".
*/
public class MatchLastItems {

    public static boolean matchLastItem(String[] str){

        String concate = "";

        // concatenate all elements except last
        for(int i=0; i<str.length-1; i++){
            concate = concate + str[i];
        }
        // compare with last element
        return concate.equals(str[str.length-1]);
    }
    public static void main(String[] args) {
        String[] str = {"i", "love", "tesh", "ilovetesh"}; //true
        boolean result = matchLastItem(str);
        System.out.println(result);
    }
}
