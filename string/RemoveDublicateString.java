package string;

//REmove dublicate "programming" -> "progamin"
public class RemoveDublicateString {

    public static String removeDuplicate(String str){
        String result = "";

        for(int i=0; i<str.length(); i++){

            //get individual char
            char ch = str.charAt(i);

            // when character is not found, that's why we use -1
            if(result.indexOf(ch) == -1){
                result = result + ch;
            }

            // boolean charac  = false;
            // for(int j = 0; j<result.length(); j++){
            //     if(result.charAt(j) ==ch){
            //         charac = true;
            //         break;
            //     }
            // }
            // if(!charac){
            //     result = result  + ch;
            // }
            
        }
        return result;
    }
    public static void main(String[] args) {
        String str = "programming";
        System.out.println(removeDuplicate(str));
    }
}




/*
index >= 0  → character FOUND
index == -1 → character NOT FOUND 
*/


 