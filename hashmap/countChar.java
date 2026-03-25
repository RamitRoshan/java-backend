package hashmap;
import java.util.LinkedHashMap;

/*str="ddccttda" O/P: {d=3, c=3, t=2, a=1} */
//In HashMap we can only store object(like: Character , Integer)
public class countChar {
    public static void main(String[] args) {
        String str = "ddccttda"; 
        LinkedHashMap<Character, Integer> result = new LinkedHashMap<>();

        /* Enhanced loop
        for(char ch: str.toCharArray()){}
        */
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            System.out.println(ch);

            if(result.containsKey(ch)){
                result.put(ch, result.get(ch) + 1);
            }else{
                result.put(ch, 1);
            }
            
        }
        System.out.println(result);
    }
}





 