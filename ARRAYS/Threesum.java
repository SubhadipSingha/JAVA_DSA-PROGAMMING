package ARRAYS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Threesum {
    public static List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>> list = new ArrayList<>();
       Arrays.sort(nums);
       for(int i = 0 ; i<nums.length-2; i++ ){
           if( i > 0 && nums[i] == nums[i-1]) continue;
         int j = i + 1 ; 
         int r = nums.length -1;

        while( j < r){
             int value = nums[i] + nums[j] + nums[r];
            if(value == 0 ){
               list.add(Arrays.asList(nums[i] , nums[j] , nums[r]));
               while(j<r && nums[j] == nums[j+1]) j++;
               while(j<r && nums[r] == nums[r-1]) r--;
             j++;
             r--;
            }else if( value < 0){
                 j++;
            }else {
                r--;
            }
        } 
    }  
        return list;
        
    }
    public static void main(String[] args) {
       int[] nums = {-5,1,2,5,-5 , -6,2, -3,-1,-4};
       System.out.println(threeSum(nums));
    }
}
