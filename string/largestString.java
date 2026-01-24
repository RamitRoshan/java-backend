package string;

public class largestString {

    public static String longestWord(String str){

        String[] words = str.split(" ");
        String longest = "";

        for(int i=0; i<words.length; i++){
            if(words[i].length() > longest.length()){
                longest = words[i];
            }

            //if there are multiple string of the same length, return the 1st string
            if(words[i].length() == longest.length()){
                return words[0];
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        String str = "weather is beautiful";
        System.out.println(longestWord(str)); //beautiful

        //if there are multiple string of the same length, return the 1st string
        String str1 = "Abhishek handsome guysboys";
        System.out.println(longestWord(str1));
    }
}








 