package hashmap;

import java.util.ArrayList;

/*
Using ArrayList solve this questions: find repetative character
str="ddccttda" O/P:dct
*/
public class repeatedCharacter {
    public static void main(String[] args) {
        String str = "ddccttda";
        
        ArrayList<Character> result = new ArrayList<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            System.out.println(ch);

            if(str.indexOf(ch) != str.lastIndexOf(ch)){

                //when result doesnot contains ch
                if(!result.contains(ch)){
                    result.add(ch);
                }
            }
        }
        System.out.println(result);
    }
}



//dynamic method dispatch

 
