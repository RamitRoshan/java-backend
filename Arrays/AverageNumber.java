package Arrays;

/*
Is the Average of All Elements a Whole Number?
Create a function that takes an array as an argument and returns true or false depending on 
whether the average of all elements in the array is a whole number or not.
Examples :
isAvgWhole([1, 3]) ➞ true
isAvgWhole([1, 2, 3, 4]) ➞ false 
isAvgWhole([1, 5, 6]) ➞ true

formula: 
To find the average (mean) of numbers, use this formula:
Average = Sum of all numbers / Number of values

If the sum of elements is perfectly divisible by the number of elements, then the average is a whole number.
*/

public class AverageNumber {

    public static boolean isAverage(int[] arr){

        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        // check if average is whole number
        return sum % arr.length == 0;
    }
    public static void main(String[] args) {
        int[] array1  = {1, 3}; //true
        int [] array2 = {1,2,3,4}; //false

        boolean result1  = isAverage(array1);
        boolean result2  = isAverage(array2);

        System.out.println(result1);
        System.out.println(result2);
    }
}
