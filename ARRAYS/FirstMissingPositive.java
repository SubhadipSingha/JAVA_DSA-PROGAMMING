package ARRAYS;

import java.util.Arrays;

public class FirstMissingPositive {
    
    public static int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int limit  =  nums.length <= 3 ?  nums.length  : nums[nums.length - 1 ]  , idx = 0;
        for(int   i = 1 ; i <= limit ; i++){
            if(i != nums[idx]) return i;
        }
        return 0;
        
    }

    public static void main(String[] args) {
       int num[] = {7,8,9,11,12};
       int num1[] = {1,2,0};
        System.out.println(firstMissingPositive(num));
        System.out.println(firstMissingPositive(num1));
    }
}