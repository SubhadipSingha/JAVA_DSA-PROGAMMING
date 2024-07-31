package SORTING_ALGORITHMS;

import java.util.Arrays;

public class SortArrayByParity {
    public static int[] sortArrayByParity(int[] nums) {
        int n  = nums.length , left = 0 , right = nums.length-1;
               while(left<right){

                if(nums[left]%2 == 0){
                     left++;
                   }
                else if(nums[right]%2 != 0){
                    right--;
                   }else{
                
                    int temp = nums[left];
                   nums[left] = nums[right];
                   nums[right] =  temp ; 
                   left++;
                   right--;
                   }
                   
               }
        return nums;
    }
    public static void main(String[] args) {
       int[] nums  = {6,7,5,4};
        System.out.println(Arrays.toString(sortArrayByParity(nums))); 
    }
}
