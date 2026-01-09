package Functions;

import java.util.Arrays;
public class PrintingNames {

    //function
    public static void printNames(String[] arr){
        //enhanced for loop (for each loop)
        for(String name: arr){
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        String[] names = {"savarkar", "godse", "mohanbhagwat"};
        printNames(names);

        System.out.println("Sorted arrays name(ascending): ");
        Arrays.sort(names);
        printNames(names);

        //sorted array in reverse
        System.out.println("Sorted arrays name(descending): ");
        int start = 0;
        int end = names.length - 1;

        while (start < end) {
            String temp = names[start];
            names[start] = names[end];
            names[end] = temp;
            start++;
            end--;
        }
        printNames(names);
    }

}