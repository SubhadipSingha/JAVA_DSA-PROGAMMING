package ARRAYS;

public class ThirdMaxNum {
    public static int ThirdMax(int[] nums){
     int n = nums.length;
     int num = Integer.MIN_VALUE;
     int count = 0;
     for(int i=0; i<n;i++){
        if(nums[i] > nums[n-1-i] || nums[i] < nums[n-1-i]){
         count++;
        }
     }
     for (int i : nums) {
        if(count < 3){
            return Math.max(num, i);
         }
     }
     
     return nums[n-1];
    }
    public static void main(String[] args) {
        int[] nums = {3,2,2,1};
        System.out.println(ThirdMax(nums));
    }
}
