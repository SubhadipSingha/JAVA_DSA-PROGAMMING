package ARRAYS;

import java.util.Arrays;

public class ThreeSumCloseses {
   public static int threesumclose(int[] nums ,int target){
    Arrays.sort(nums);
     int close = nums[0] + nums[1] + nums[2];
    for(int i= 0 ; i < nums.length - 2 ; i++){
        if( i < 0  && nums[i] == nums[i-1]) continue;
        int j = i + 1 ;
        int r = nums.length - 1;
        while( j < r){
            int current = nums[i] + nums[j] + nums[r];
             if (current == target) {
                    return current;
                }
                if (Math.abs(current - target) < Math.abs(close - target)) {
                    close = current;
                }
             if( current < target ){
                j++;
             }else{
                r--;
             }
        }
     }
     return close;
    }

   

    public static void main(String[] args) {
        int[] nums ={1,2,3,4,5,6};
        int target = 15;
        System.out.println(threesumclose(nums, target));
    }
}
