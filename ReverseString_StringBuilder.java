public class ReverseString_StringBuilder {
    public static void main(String[] args) {
        
        String str = "dct";
     

        StringBuilder sb = new StringBuilder();

        for(int i= str.length()-1; i>=0; i--){
            sb.append(str.charAt(i));
        }
        System.out.println(sb.toString());
    }
}


/*
2nd methods

public class ReverseString_StringBuilder {
    public static void main(String[] args) {

        String str = "dct";
        String reversed = new StringBuilder(str).reverse().toString();

        System.out.println(reversed);
    }
}

*/


