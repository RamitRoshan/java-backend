package Arrays;

/*
Difference of Max and Min Numbers in Array.
Create a function that takes an array and returns the difference between the biggest and smallest numbers.
Examples: 

differenceMaxMin([10, 4, 1, 4, -10, -50, 32, 21]) -> 82
Smallest number is -50, biggest is 32.

differenceMaxMin([44, 32, 86, 19]) ->  67
Smallest number is 19, biggest is 86
*/

public class DiffMaxMinNums {

    public static int differenceMaxMin(int[] arr){

        // initialising array
        // int max = arr[0];
        // int min = arr[0];

        // here it works reverse thing in max it shows min and vice versa
        int max  = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];

            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return max - min;
    }
    public static void main(String[] args) {
        int[] array1 = {10, 4, 1,4,-10, -50,32,21};
        int[] array2 = {44, 32, 86, 19};

        int result1 = differenceMaxMin(array1);
        int result2 = differenceMaxMin(array2);

        System.out.println(result1);
        System.out.println(result2);
    }
}


 