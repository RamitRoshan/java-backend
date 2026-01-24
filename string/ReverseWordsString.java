package string;

// Reverse words, "java is good" -> "avaj si doog"
public class ReverseWordsString {

    public static String reverseWords(String str){
        String[] words = str.split(" ");

        String result = " ";

        for(int i = 0; i<words.length; i++){
            //getting current words
            String word = words[i];
            
            String reverseWords = " ";
            for(int j=word.length()-1; j>=0; j--){
                reverseWords = reverseWords + word.charAt(j);
            }
            result = result + reverseWords;
        }
        // return result;
        return result.trim(); // as u can see there is space after good so to remove we use trim.
    }
    public static void main(String[] args) {
        String str = "java is good ";
        System.out.println(reverseWords(str));
    }
}
 
