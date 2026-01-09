package Arrays;

// import java.util.Arrays;

// public class SumConcatArr {
//     public static void main(String[] args) {
        
//         int[] arr1 = {10, 20, 30};
//         int[] arr2 = {40, 50, 60};

//         int sum1 = 0;
//         int sum2 = 0;

//         // sum of arr1
//         for (int i = 0; i < arr1.length; i++) {
//             sum1 += arr1[i];
//         }

//         // sum of arr2
//         for (int i = 0; i < arr2.length; i++) {
//             sum2 += arr2[i];
//         }

//         //concatenation
//         int[] concat = new int[arr1.length + arr2.length];
//         int index = 0;
//         for(int i=0; i<arr1.length; i++){
//             concat[index] = arr1[i];
//             index++;
//         }
//         for (int i = 0; i < arr2.length; i++) {
//             concat[index] = arr2[i];
//             index++;
//         }
//         System.out.println("Sum of arr1: " + sum1);
//         System.out.println("Sum of arr2: " + sum2);
//         System.out.println("Concatenation: " + Arrays.toString(concat));
//     }
// }


//Alternate array mergeing
import java.util.Arrays;

public class SumConcatArr {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30};
        int[] arr2 = {40, 50, 60};

        int[] result = new int[arr1.length + arr2.length];

        int index = 0;
        for(int i=0; i<arr1.length; i++){
            result[index++] = arr1[i];
            result[index++] = arr2[i];
        }
        System.out.println("Alternate merging array: "+ Arrays.toString(result));
    }    
}
