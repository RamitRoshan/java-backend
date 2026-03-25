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

        HashMap<String, Integer> length = new HashMap<>();

        for(int i=0; i<words.length; i++){
            length.put(words[i], words[i].length());
        }
        System.out.println(length);
    }
}






 