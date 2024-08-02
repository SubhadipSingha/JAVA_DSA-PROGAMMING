package ARRAYS;

import java.util.Arrays;

public class CountTheNoOfOnesToGroup {
    public static int CountNoOfOnes(int[] nums){
        
        int count = 0 , k= Arrays.stream(nums).sum() , n = nums.length;
          for(int i = 0 ; i < k ; i++){
            count+=nums[i];
          }
        int max= count;
        
        //sliding window technique 
        for(int i = k ; i < n + k ; ++i){
            count += nums[i%n] -  nums[(i - k + n) % n];
            max = Math.max(max, count);
        }
        
    
        return k - max;
        
    }
    public static void main(String[] args) {
        int[] nums = {0,1,0,1,1,0};
        System.out.println(CountNoOfOnes(nums));
    }
}
