// 1st Methods : 

// public class ReverseArray {
//     public static void main(String[] args) {
//         int[] arr = {11, 22, 33, 44};

//         System.out.print("Reversed array is: ");
//         for(int i=arr.length-1; i>=0; i--){
//             System.out.print(arr[i] + " ");
//         }

//     }
// }


// 2nd methods 
// import java.util.Arrays;

// public class ReverseArray {
//     public static void main(String[] args) {
//         int[] arr = {11, 22, 33, 44};

//         //reveerse the array
//         int[] revArr = new int[arr.length];
//         int idx = 0;
 
//         for(int i=arr.length-1; i>=0; i--){
//             revArr[idx]= arr[i];
//             idx++;
//         }
//         System.out.print( "Reversed: " + Arrays.toString(revArr));
//     }
// }


//3rd methods(Interview-Ques): Reversing the array inline...(in-place, without extra space i.e we cannot change the original array)

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};


        int start = 0;
        int end = arr.length -1;
        while (start < end){
            //swapping the array
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}



// 4th Methods: Reversing the array using arraylist (collections)

// import java.util.ArrayList;
// import java.util.Collections;

// public class ReverseArray {
//     public static void main(String[] args) {
//         ArrayList<Integer> a = new ArrayList<>();

//         a.add(11);
//         a.add(22);
//         a.add(33);
//         a.add(44);

//         System.out.println("Original arrays: " + a);

//         //reverse the array
//         Collections.reverse(a);
//         System.out.println("Reversed arrays: " + a);
//     }
// }
 

