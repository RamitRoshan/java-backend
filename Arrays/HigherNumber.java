package Arrays;

import java.util.Arrays;

/* Write a function that returns true, if there exists at least one number that is larger than
or equal to n.
existsHigher([5,3,15,22,4], 10) -> true
*/
public class HigherNumber {

    public static boolean existsHigher(int[] arr, int n){

        for(int i=0; i<arr.length; i++){
            if(arr[i] >= n){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] array = {5,3,15,22,4};
        int number = 10; //true
        boolean ans = existsHigher(array, number);
        System.out.println(ans);

        
        //printing array (just normally printing array)
        System.out.println(Arrays.toString(array));
    }
}


//2ndmethods (Flag Approach)
// package Arrays;
// public class HigherNumber {
//     public static boolean existsHigher(int[] arr, int n){
//         //flag approach
//         boolean isHigh = false;
//         for(int i=0; i<arr.length; i++){
//             if(arr[i] >= n){
//                 isHigh = true;
//                 break; //stop when it's true
//             }
//         }
//         return isHigh;
//     }
//     public static void main(String[] args) {
//         System.out.println(existsHigher(new int[] {5,3,15,22,4}, 10));  //true
//         System.out.println(existsHigher(new int[] {1,2,3,4,5}, 8)); //false
//     }
// }
 
