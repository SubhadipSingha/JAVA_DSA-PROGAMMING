package ARRAYS;

import java.util.Arrays;

public class SmallestRangeOfII {
  

   
        public static int FindOutII(int[] nums, int k) {
            // Sort the array
            Arrays.sort(nums);
            int n = nums.length;
            
            // Initial range without any modification
            int result = nums[n - 1] - nums[0];
            
            // Iterate through the array to find the possible minimum score
            for (int i = 0; i < n - 1; ++i) {
                int max = Math.max(nums[n - 1] - k, nums[i] + k);
                int min = Math.min(nums[0] + k, nums[i + 1] - k);
                result = Math.min(result, max - min);
            }
            
            return result;
        }
    
            public static void main(String[] args) {
            int[] nums = {1,3,6};
            int k = 3;
            System.out.println(FindOutII( nums, k));
        }
}
