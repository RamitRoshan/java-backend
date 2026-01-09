package Functions;

public class SumTwoArraysFunc {

    public static int calcTotal(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] a1 = {10, 20, 30};
        int[] a2 = {40, 50, 60, 70};
        
        int totalBothSum  = calcTotal(a1) + calcTotal(a2);

        System.out.println("Addition of both arrays is: " + totalBothSum);
    }
}
