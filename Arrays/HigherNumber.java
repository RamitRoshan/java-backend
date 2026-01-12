package Arrays;

/* Write a function that returns true, if there exists at least one number that is larger than
or equal to n.
existsHigher([5,3,15,22,4], 10) -> true
*/
public class HigherNumber {

    public static boolean existsHigher(int[] arr, int n){

        for(int i=0; i<arr.length; i++){
            if(arr[i] > n){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] array = {5,3,15,22,4};

        int number = 10;
        boolean ans = existsHigher(array, number);
        System.out.println(ans);
    }
}


 
