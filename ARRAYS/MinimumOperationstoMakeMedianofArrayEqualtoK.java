package ARRAYS;

import java.util.Arrays;

public class MinimumOperationstoMakeMedianofArrayEqualtoK {
  
  
    public static long minOperationsToMakeMedianK(int[] nums, int k) {
        Arrays.sort(nums); 
        int n = nums.length;
        int medianIndex = n / 2;
        long operations = 0;
        if(nums[medianIndex] == k) return 0;
        operations = Math.abs(nums[medianIndex] - k) + 1;

        return operations; 
    }
  
    public static void main(String[] args) {
        int nums[] = {2,5,6,8,5}, k = 7;
        System.out.println(minOperationsToMakeMedianK(nums, k));
    }
}
