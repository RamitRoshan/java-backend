import java.util.Arrays;

public class NumberArr {
    public static void main(String[] args) {
         int[] numbers = new int[5];
        System.out.println(Arrays.toString(numbers));

        //assign the value
        numbers[0] = 10;
        numbers[1] = 11;
        numbers[2] = 12;
        numbers[3] = 13;
        numbers[4] = 14;

        System.out.println(Arrays.toString(numbers));

        //loop over the numbers array
        // for(int i=0; i<numbers.length; i++){
        //     System.out.println(numbers[i]);
        // }

        // ENhanced for loop (for-each)
        for(int printNumber: numbers){
            System.out.println(printNumber);
        }
    }
}
