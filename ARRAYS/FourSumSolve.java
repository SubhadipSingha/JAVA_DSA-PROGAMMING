package ARRAYS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSumSolve {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
      List<List<Integer>> list = new ArrayList<>();
      Arrays.sort(nums);
      if(target < 0){
        return list;
      }
      for (int i = 0; i < nums.length - 3; i++) {
    
      if(i>0 && nums[i] == nums[i - 1]) continue;
      for (int j = i+1; j < nums.length - 2; j++) {
       
        if (j > i + 1 && nums[j] == nums[j - 1]) continue;
        int l = j+1;
        int r = nums.length - 1;
         while(l < r){
            long current = (long) nums[i] + nums[j] + nums[l] + nums[r];
            if( current == target){
                list.add(Arrays.asList( nums[i] , nums[j] , nums[l] , nums[r]));
                while( l < r && nums[j] == nums[l+1]) l++;
                while( l < r && nums[r] == nums[r-1]) r--;
                l++;
                r--;
            }else if( current < target){
                l++;
            }else{
                r--;
            }
         }
      } 
      } 

       return list;
        
    }
   
   
    public static void main(String[] args) {
       int nums[] = {1000000000,1000000000,1000000000,1000000000}, target = -294967296;
       System.out.println(fourSum(nums, target));
    }
}
