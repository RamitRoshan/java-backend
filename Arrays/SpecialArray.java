package arrays;

/* Special Arrays: 
An array is special if every even index contains an even number and every 
odd index contains an odd number. 
Create a function that returns true if an array is special, and false otherwise.
Examples:

isSpecialArray([2, 7, 4, 9, 6, 1, 6, 3]) ➞ true
(Even indices: [2, 4, 6, 6]; Odd indices: [7, 9, 1, 3])

isSpecialArray([2, 7, 9, 1, 6, 1, 6, 3]) ➞ false
(Index 2 has an odd number 9)
*/
public class SpecialArray {

    public static boolean isSpecialArray(int[] arr){

        for(int i=0; i<arr.length; i++){

            // even index should have even value
            if(i % 2 == 0 && arr[i] % 2 != 0){
                return false;
            }
            // odd index should have odd value
            if(i % 2 != 0 && arr[i] % 2 == 0){
                return false;
            }

        }
        return  true; // all indices passed
    }
    public static void main(String[] args) {
        int[] array = {2, 7, 4, 9, 6, 1, 6, 3}; //true
        
        boolean result = isSpecialArray(array);

        System.out.println(result);
    }
}
