public class CountChar {
    public static void main(String[] args) {
        
        //count the number of a's present
        String name = "bangalore";
        char ch = 'a';
        int count = 0;

        for(int i=0; i<name.length(); i++){
            if(name.charAt(i) == ch){
                count++;
            }
        }
        System.out.println("total a's in " + name + " is: " + count);

    }
}
