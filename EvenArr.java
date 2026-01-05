import java.util.*;

public class EvenArr {
    public static void main(String[] args) {
      
      int[] arr = {10, 11, 12, 13, 14};
      System.out.println(Arrays.toString(arr));
      
      int evenCount = 0;
      for(int i=0; i<arr.length; i++){
        if(arr[i] % 2 == 0){
             evenCount++; 
        }
      }
      int[] result = new int[evenCount];
      
       System.out.println(Arrays.toString(result));
      
      int index = 0; // to insert values
      for (int i = 0; i < arr.length; i++) {
          if (arr[i] % 2 == 0) {
              result[index] = arr[i];
              index++;
          }
      }
        
        
      System.out.println(Arrays.toString(result));
  }
}
