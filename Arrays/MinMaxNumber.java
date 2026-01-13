package Arrays;

import java.util.Arrays;

/*
Find the Smallest and Biggest Numbers.
Create a function that takes an array of numbers and return both the minimum and 
maximum numbers, in that order.
Examples: 
minMax([1, 2, 3, 4, 5]) ➞ [1, 5]
minMax([2334454, 5]) ➞ [5, 2334454]
minMax([1]) ➞ [1, 1]
*/
public class MinMaxNumber {

    public static int[] minMax(int[] arr){

        // Initialize min to maximum possible value, so any number in array will be smaller
        int min = Integer.MAX_VALUE;

        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        // Create a new array of size 2 to store the minimum and maximum values
        // Index 0 → min, Index 1 → max
       // We return this array because a Java method can return only a single value,
      // so packing both min and max into an array allows us to return both together
        return new int[]{min, max};
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        int[] result = minMax(array);

        // 1st way to print the array
        for(int i=0; i<result.length; i++){
            System.out.println(result[i]+ " ");
        }

        //2nd ways to print
        System.out.println(Arrays.toString(result));
    }
}
