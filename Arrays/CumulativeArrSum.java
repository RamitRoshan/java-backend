package arrays;

import java.util.Arrays;

/*
Cumulative Array SumCreate a method that takes an array of integers and returns an array where 
each integer is the sum of itself + all previous numbers in the array.
Examples:

cumulativeSum([1, 2, 3]) ➞ [1, 3, 6]
cumulativeSum([1, -2, 3]) ➞ [1, -1, 2]
*/
public class CumulativeArrSum {

    public static int[] cumulativeSum(int[] arr){
        
        int[] result = new int[arr.length];
        int sum = 0;

        for(int i= 0; i<arr.length; i++){
            
            sum = sum + arr[i];  //0 + 1 = 1

            result[i] = sum;  //[1, 0, 0]
        }
        return result;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3}; //[1, 3, 6]
        
        // we use a loop to print arrays because Java cannot print array elements automatically.
        // for(int i = 0; i<array.length; i++){
        //     System.out.print(array[i] + " ");
        // }
        System.out.println(Arrays.toString(array));
    }
}
