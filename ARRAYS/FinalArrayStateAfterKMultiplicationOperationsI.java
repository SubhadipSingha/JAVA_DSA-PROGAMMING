package ARRAYS;

import java.util.Arrays;

public class FinalArrayStateAfterKMultiplicationOperationsI {
   
    public static int[] getFinalState(int[] nums, int k, int multiplier) {
      
        while( k > 0){
            int min =  0 ;
         for (int n  = 0 ; n < nums.length ; n++) {
           if(nums[n] < nums[min]){
            min = n;
           }
         }
         nums[min] *= multiplier;
        k--; 
    }  return nums;
        
    }
   
   
    public static void main(String[] args) {
        int nums[] = {2,1,3,5,6}, k = 5, multiplier = 2;
        System.out.println(Arrays.toString(getFinalState(nums, k, multiplier)));
    }
}
