package ARRAYS;

public class MaximumProductSubarray {

    public static int maxProduct(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
           int max = nums[0];
           int min = nums[0];
           int ans = nums[0];
        for (int i = 1 ; i < nums.length; i++) {
            int current = nums[i]; if(current < 0){
                int temp = current;
                max = min ;
                min = temp;
            }
              max = Math.max(current , max * current);
              min = Math.max(current , min * current);
              ans = Math.max(ans , max);
              
            }
            
              return ans;
        }
       
        

    public static void main(String[] args) {
        int nums[] = {-2,0,-1};
        System.out.println(maxProduct(nums));
    }
}
