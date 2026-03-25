package hashmap;

import java.util.LinkedHashMap;


//LinkedHashMap gives the output in the order of intesertion input 

public class LinkedHashmap {
    public static void main(String[] args) {
        String[] words = {"mango", "apple", "orange"};
        
        LinkedHashMap<String, Integer> result = new LinkedHashMap<>();

        for(int i = 0; i < words.length; i++){
            result.put(words[i], words[i].length());
        }

        System.out.println(result);
    }
}