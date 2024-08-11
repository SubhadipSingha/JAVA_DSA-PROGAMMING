package ARRAYS;

public class MaximumSubArray {
     public static int maxSubArray(int[] nums) {
        int n = nums.length ,  maxend = nums[0] ,maxsum = nums[0] ;
        
        for(int i = 1 ; i<n ; i++ ){
             maxend = Math.max(nums[i], maxend + nums[i]);
             maxsum = Math.max(maxsum , maxend);
             System.out.println("Index"+i+" Element: "+nums[i]+"\tmaxend: "+maxend+"\tmaxsum: "+maxsum);
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int[] nums = {8,-8,3,-1,2,-2,5,10};
        System.out.println(maxSubArray(nums));
    }
}
