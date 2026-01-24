package arrays;

//Interview Questions : int[] arr = {0,1,1,0,0,1} -> O/P: [0,0,0,1,1,1]
public class MoveZerosAtBegin {

    public static int[] moveZeroBegin(int[] arr){
        
        int[] result = new int[arr.length];

        int index = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                result[index] = arr[i];
                index++;
            }
        }


        return result;
    }
    public static void main(String[] args) {
        System.out.println(moveZeroBegin(new int[] {0,1,1,0,0,1}));
    }
}



/*
package arrays;

import java.util.Arrays;

// Interview Question: move all 0s to beginning
public class MoveZerosAtBegin {

    public static int[] moveZeroBegin(int[] arr) {
        int[] result = new int[arr.length];
        int index = 0;

        // Step 1: add all zeros
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                result[index++] = arr[i];
            }
        }

        // Step 2: add all non-zeros
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                result[index++] = arr[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] output = moveZeroBegin(new int[]{0,1,1,0,0,1});
        System.out.println(Arrays.toString(output));
    }
}

*/