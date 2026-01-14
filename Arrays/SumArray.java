package arrays;

public class SumArray {
    public static void main(String[] args) {
        
        int[] arr1 = {10, 20, 30};

        // find the sum of array
        int sum = 0;

        // //for-loop
        // for(int i=0; i<arr1.length; i++){
        //     sum = sum + arr1[i];
        // }
        // System.out.println(sum);

        //enhanced for loop(for-each loop)
        for(int sumNumber: arr1){
            sum  = sum + sumNumber;
        }
        System.out.print("Sum: " + sum);
    }
}
