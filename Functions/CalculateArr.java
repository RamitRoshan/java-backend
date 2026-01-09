package Functions;

public class CalculateArr {

    public static int calcTotal(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] array = {10, 20, 30};
        int sumT = calcTotal(array);
        System.out.println("Total sum of arrays is: "+ sumT);
    }
}
