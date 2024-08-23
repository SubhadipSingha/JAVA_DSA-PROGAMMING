package ARRAYS;

import java.util.Arrays;

public class MakeArrayZeroBySubstractingEqualAmout {
    public static int minimumOperations(int[] nums) {
        int s = nums.length ,  steps = 0 ;
        while(true){
        int min  = Integer.MAX_VALUE;
        for (int n : nums) {
            if(n > 0  ){ 
                min  =  Math.min(min ,n);
               
            }
        }
         if( min == Integer.MAX_VALUE){
                break;
            }
         for (int i = 0; i < s; i++) {
             if(nums[i] != 0){
                nums[i] -= min;
            }
         }
         System.out.println(Arrays.toString(nums));
        steps++;
    }
        // System.out.println(Arrays.toString(nums));
        return steps;
        
        
    }
    
    public static void main(String[] args) {
        int nums[] = {9,8,4,3,2,5};
        System.out.println(minimumOperations(nums));
    }
}
