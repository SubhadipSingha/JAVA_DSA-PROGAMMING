package ARRAYS;

public class LongestSubarrayWithMaximumBitwiseAND {

    public static int longestSubarray(int[] nums) {
        int max = Integer.MIN_VALUE , start = 0 , maxi =1 , count = 0;
        for (int n  : nums) {
            max =Math.max(max,n);
        }
        while(start <nums.length ){
          if(nums[start] == max){
              while( start < nums.length && nums[start++] == max){
                  count++;
              }
              maxi = Math.max(maxi,count);
              count = 0 ; 
          }else{
              start++;
          }
        }
        
          return maxi ;
    }
    public static void main(String[] args) {
        int nums1[]= { 1,2,3,4} , nums2[]= { 1,2,3,3,2,2} , nums3[] = {311155,311155,311155,311155,311155,311155,311155,311155,201191,311155};
        System.out.println(longestSubarray(nums1));
        System.out.println(longestSubarray(nums2));
        System.out.println(longestSubarray(nums3));
    }
}
