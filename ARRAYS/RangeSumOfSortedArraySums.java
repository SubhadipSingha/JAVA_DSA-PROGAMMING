package ARRAYS;

import java.util.Arrays;

public class RangeSumOfSortedArraySums {
    public static int rangeSum(int[] nums, int n, int left, int right) {
        int s = n * (n + 1) / 2;
        int[] arr = new int[s];
        int index = 0;
       
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            System.out.println(sum);
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                arr[index++] = sum;
            }
        }
        
        
        Arrays.sort(arr);
        
        
        int result = 0;
        final  int mod = (int) 1e9 + 7;
        for (int i = left - 1; i < right; i++) {
            result = (result + arr[i]) % mod;
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int n = 4  , left  = 1 , right = 5;
      System.out.println(rangeSum(nums, n, left, right)); 
    }
}
