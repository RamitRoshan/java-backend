package hashmap;

import java.util.HashMap;

/*
HashMap:
    key - word
    value - length of the word
*/

public class findLengthWord {
    public static void main(String[] args) {
        String[] words = {"mango", "apple", "orange"};

        HashMap<String, Integer> result = new HashMap<>();

        for(int i=0; i<words.length; i++){
            result.put(words[i], words[i].length());
        }
        System.out.println(result);
        System.out.println(result.get("peach")); //key doesnot exist then it will return null

        //checking something is present or not
        System.out.println(result.containsKey("peach"));
    }
}






 