package ARRAYS;

import java.util.Arrays;

public class SmallestMissingIntegerGreaterThanSequentialPrefixSum {
    public static int missingInteger(int[] nums) {
        
        int max = nums[0];
        for (int i=0;i<nums.length;i++) {
            if(nums[i+1] == nums[i]+1){
               max+=nums[i+1];
            }else{
                break;
            }
        }
        Arrays.sort(nums);
        for (int num : nums) {
            if(num == max){
                max++;
            }
        }
        
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,2,5};
        System.out.println(missingInteger(nums));
    }
}
