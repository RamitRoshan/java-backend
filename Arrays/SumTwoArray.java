package arrays;

public class SumTwoArray {
    public static void main(String[] args) {

        // find the sum of elements from both arrays - 280
        int[] arr1 = {10, 20, 30};
        int[] arr2 = {40, 50, 60, 70};

        int sum1 = 0;
        int sum2 = 0;

        for(int i=0; i<arr1.length; i++){
            sum1 += arr1[i];
        }

        for(int i=0; i<arr2.length; i++){
            sum2 += arr2[i];
        }

        System.out.println("Sum of arr1: " + sum1);
        System.out.println("Sum of arr2: " + sum2);
        
        int finalSum = sum1 + sum2;
        System.out.println("Sum of arr1 and arr2 is: " + finalSum);
    }

}
